package com.cognizant.moviecruiser.service;

import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.exception.UserAlreadyExistsException;
import com.cognizant.moviecruiser.model.Users;

@Service
public interface UserService {

	Users getAllUser(int id);

	public void signUp(Users user) throws UserAlreadyExistsException;
}
