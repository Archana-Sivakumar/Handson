package com.cognizant.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "department")

public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="dp_id")
	private int id;
	
	@Column(name="dp_name")
	private String name;

	
	@OneToMany(mappedBy = "department")
	//@JsonBackReference
    private List<Employee> employeeList;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
