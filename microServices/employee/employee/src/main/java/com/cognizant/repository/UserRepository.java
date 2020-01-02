package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.User;




@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUserName(String name);
}
