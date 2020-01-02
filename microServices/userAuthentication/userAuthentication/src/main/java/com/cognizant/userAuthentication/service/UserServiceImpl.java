package com.cognizant.userAuthentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.userAuthentication.model.User;
import com.cognizant.userAuthentication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByUserName(String name) {
		
		return userRepository.findByUserName(name);
		
	}
	
	

}
