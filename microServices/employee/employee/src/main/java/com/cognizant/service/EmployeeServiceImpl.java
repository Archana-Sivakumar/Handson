package com.cognizant.service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.EmployeeApplication;
import com.cognizant.model.Employee;
import com.cognizant.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(EmployeeApplication.class);

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee getEmployee(int id) {
		/*Employee employee = null;
		Optional<Employee> oneEmployee = employeeRepository.findById(id); 
		if(!oneEmployee.isPresent()) {
			
		}
		else {
			employee = oneEmployee.get();
		}
		return employee;*/
		
	        LOGGER.info("Start");
	        return employeeRepository.findById(id).get();
	 }
	
	
    public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}
    
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee) {
	    return employeeRepository.save(employee);
    }


	
	 @Override 
	 public List<Employee> getAllPermanentEmployees() {
	  
	    return employeeRepository.getAllPermanentEmployees(); 
	 }
	 
}