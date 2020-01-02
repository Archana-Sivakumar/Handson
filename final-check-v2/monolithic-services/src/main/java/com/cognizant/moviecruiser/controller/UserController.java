package com.cognizant.moviecruiser.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.moviecruiser.MovieCruiserApplication;
import com.cognizant.moviecruiser.exception.UserAlreadyExistsException;
import com.cognizant.moviecruiser.model.Users;
import com.cognizant.moviecruiser.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/movie-cruiser") 
public class UserController {
    
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public Users getAllUser(@PathVariable int id) {
		
		return userService.getAllUser(id);
	}
	
	@PostMapping("/sign-up")
	public void signup(@RequestBody @Valid Users user) throws UserAlreadyExistsException{
		
		LOGGER.info("Start");
		
		userService.signUp(user);
		
		LOGGER.info("End");
	}	
	
	public PasswordEncoder passwordEncoder() {
		
	     LOGGER.info("Start");
	     return new BCryptPasswordEncoder();
	        
	}
	
}
