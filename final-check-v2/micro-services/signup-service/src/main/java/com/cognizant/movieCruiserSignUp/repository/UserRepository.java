package com.cognizant.movieCruiserSignUp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.movieCruiserSignUp.model.Users;



@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
	
	Users findByUserName(String name);
}
