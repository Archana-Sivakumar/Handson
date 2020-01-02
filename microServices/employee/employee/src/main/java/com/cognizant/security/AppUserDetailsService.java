package com.cognizant.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cognizant.model.User;
import com.cognizant.repository.UserRepository;


@Service
public class AppUserDetailsService implements UserDetailsService{

	
	@Autowired
	private UserRepository userRepository;
	
	public AppUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByUserName(username);
		
		UserDetails appUser = null;
		if(user==null) {
			throw new UsernameNotFoundException("User Not Found");
		} else {
			appUser = new AppUser(user);
		}
		return appUser;
	}
	

}
