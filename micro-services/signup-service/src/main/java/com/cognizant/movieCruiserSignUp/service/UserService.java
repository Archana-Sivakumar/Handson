package com.cognizant.movieCruiserSignUp.service;

import org.springframework.stereotype.Service;

import com.cognizant.movieCruiserSignUp.exception.UserAlreadyExistsException;
import com.cognizant.movieCruiserSignUp.model.Users;


@Service
public interface UserService {

	Users getAllUser(int id);

	public void signUp(Users user) throws UserAlreadyExistsException;
}
