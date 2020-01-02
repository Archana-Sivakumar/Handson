package com.cognizant.moviecruiser.service;

import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.MovieCruiserApplication;
import com.cognizant.moviecruiser.exception.UserAlreadyExistsException;
import com.cognizant.moviecruiser.model.Role;
import com.cognizant.moviecruiser.model.Users;
import com.cognizant.moviecruiser.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder encoder;

	@Override
	public Users getAllUser(int id) {

		return userRepository.findById(id).get();
	}

	@Override
	public void signUp(Users userDetails) throws UserAlreadyExistsException {
		
		LOGGER.info("Start");

		Users user = userRepository.findByUserName(userDetails.getUserName());

		if (user != null) {
			
			LOGGER.info("End");
			throw new UserAlreadyExistsException();
			
		} else {

			String encodedPassword = encoder.encode(userDetails.getPassword());

			Set<Role> roleList = new HashSet<Role>();
			roleList.add(new Role(1, "user"));

			userDetails = new Users(0, userDetails.getUserName(), userDetails.getFirstName(), userDetails.getLastName(),
					encodedPassword, null, roleList);

			userRepository.save(userDetails);
			LOGGER.info("End");
		}

	}

}
