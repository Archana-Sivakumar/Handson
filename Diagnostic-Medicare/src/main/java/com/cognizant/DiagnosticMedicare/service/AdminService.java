package com.cognizant.DiagnosticMedicare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.DiagnosticMedicare.model.Doctor;
import com.cognizant.DiagnosticMedicare.model.Medicare;
import com.cognizant.DiagnosticMedicare.model.Patient;

@Service
public interface AdminService {
	
	public List<Doctor> getAllDoctorList();
	
	public List<Patient> getAllCustomerList();
	
	public List<Medicare> getAllMedicareList();
	
	public List<Doctor> removeDoctor(String userName);
	
	public List<Patient> removePatient(String userName);
}
