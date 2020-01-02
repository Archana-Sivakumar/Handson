package com.cognizant.dto;

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

public class SkillDTO {
			private int id;
			private String name;
	        private Set<EmployeeDTO> employeeList;
	        
			public SkillDTO() {
				super();
				// TODO Auto-generated constructor stub
			}

			public SkillDTO(int id, String name) {
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

			public Set<EmployeeDTO> getEmployeeList() {
				return employeeList;
			}

			public void setEmployeeList(Set<EmployeeDTO> employeeList) {
				this.employeeList = employeeList;
			}

			@Override
			public String toString() {
				return "SkillDTO [id=" + id + ", name=" + name + "]";
			}

			
}
