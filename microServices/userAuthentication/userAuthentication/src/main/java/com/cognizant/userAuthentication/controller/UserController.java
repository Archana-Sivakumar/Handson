package com.cognizant.userAuthentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.userAuthentication.model.User;
import com.cognizant.userAuthentication.service.UserService;



@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{userName}")
	public User getByUserName(@PathVariable String userName) {
		return userService.findByUserName(userName);
	}
	
	

}
