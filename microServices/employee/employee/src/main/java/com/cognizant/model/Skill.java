package com.cognizant.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


	@Entity
	@Table(name = "skill")
	public class Skill {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		@Column(name="sk_id")
		private int id;
		
		@Column(name="sk_name")
		private String name;
		
		// @ManyToMany(mappedBy = "skillList",fetch = FetchType.EAGER)
		 @ManyToMany(mappedBy = "skillList")
		// @JsonBackReference
		 private Set<Employee> employeeList;

		public Skill() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Skill(int id, String name) {
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

		
		
		public Set<Employee> getEmployeeList() {
			return employeeList;
		}

		public void setEmployeeList(Set<Employee> employeeList) {
			this.employeeList = employeeList;
		}

		@Override
		public String toString() {
			return "Skill [id=" + id + ", name=" + name + "]";
		}

}
