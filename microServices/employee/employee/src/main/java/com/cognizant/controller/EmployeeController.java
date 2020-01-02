package com.cognizant.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.dto.DepartmentDTO;
import com.cognizant.dto.EmployeeDTO;
import com.cognizant.dto.SkillDTO;
import com.cognizant.model.Employee;
import com.cognizant.model.Skill;
import com.cognizant.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public  EmployeeDTO[] getAllEmployees() {
		return transformEmployeeToDTO(employeeService.getAllEmployees());
	}
	
	@PostMapping("/employees")
	 public Employee addEmployee(@RequestBody Employee employee) {
		 return employeeService.addEmployee(employee);
	 }
	
	
	@PutMapping("/employees")
	 public Employee updateEmployee(@RequestBody Employee employee) {
		 return employeeService.updateEmployee(employee);
	 }
	
	@GetMapping("/permanentemployees")
	public List<Employee> getAllPermanentEmployees() {
		return employeeService.getAllPermanentEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getOneEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	
	 private EmployeeDTO[] transformEmployeeToDTO(List<Employee> employee) {
		 
		 EmployeeDTO[] employeeDto = new EmployeeDTO[employee.size()];
		 
		 int count=0;
		 
		 for(Employee emp:employee) {
			 
			 employeeDto[count] = new EmployeeDTO();
			 
			 employeeDto[count].setId(emp.getId());
			 employeeDto[count].setName(emp.getName());
			 employeeDto[count].setSalary(emp.getSalary());
			 employeeDto[count].setPermanent(emp.isPermanent());
			 employeeDto[count].setDateOfBirth(emp.getDateOfBirth());
			 
			 DepartmentDTO departmentDto = new DepartmentDTO(emp.getDepartment().getId(),emp.getDepartment().getName());
			 employeeDto[count].setDepartment(departmentDto);
			 
			 Set<Skill> skillList = emp.getSkillList();
			 Set<SkillDTO> skillListDto = new HashSet();
			 for(Skill skill : skillList) {
				 SkillDTO skillDto = new SkillDTO();
				 skillDto.setId(skill.getId());
				 skillDto.setName(skill.getName());
				 skillListDto.add(skillDto);
			 }
			 
             employeeDto[count].setSkillList(skillListDto);
             count++;
		 }
		 return employeeDto;
	 }
}
