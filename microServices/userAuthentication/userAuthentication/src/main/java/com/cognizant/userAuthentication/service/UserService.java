package com.cognizant.userAuthentication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.userAuthentication.model.User;


@Service
public interface UserService {
	User findByUserName(String name);
}
