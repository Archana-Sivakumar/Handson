package com.cognizant.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.Employee;


@Service
public interface EmployeeService {
	
	Employee getEmployee(int id);
	Employee addEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	List<Employee> getAllEmployees();
	List<Employee> getAllPermanentEmployees();
}
