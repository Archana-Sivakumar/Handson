package com.cognizant.DiagnosticMedicare.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.DiagnosticMedicare.model.Users;





@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	
	Users findByUsername(String name);
	Users findById(int id);
	
}

