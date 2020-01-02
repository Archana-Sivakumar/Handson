package com.cognizant.DiagnosticMedicare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.DiagnosticMedicare.model.Admin;
import com.cognizant.DiagnosticMedicare.model.Doctor;
import com.cognizant.DiagnosticMedicare.model.Medicare;
import com.cognizant.DiagnosticMedicare.model.Patient;
import com.cognizant.DiagnosticMedicare.model.Users;
import com.cognizant.DiagnosticMedicare.repository.PatientRepository;
import com.cognizant.DiagnosticMedicare.repository.AdminRepository;
import com.cognizant.DiagnosticMedicare.repository.DoctorRepository;
import com.cognizant.DiagnosticMedicare.repository.MedicareRepository;
import com.cognizant.DiagnosticMedicare.repository.UserRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	DoctorRepository  doctorRepository;
	
	@Autowired
	AdminRepository  adminRepository;
	
	@Autowired
	PatientRepository  patientRepository;
	
	@Autowired
	MedicareRepository  medicareRepository;
	
	
	@Autowired
	UserRepository  userRepository;
	@Override
	public List<Doctor> getAllDoctorList() {
		
		return doctorRepository.findAll();
	}

	@Override
	public List<Patient> getAllCustomerList() {

		return patientRepository.findAll();
	}

	@Override
	public List<Medicare> getAllMedicareList() {
		
		return medicareRepository.findAll();
	}

	@Override
	public List<Patient> removePatient(String userName) {
			Patient patient = patientRepository.findByUsername(userName);		
			patientRepository.delete(patient);
			System.out.println(patientRepository.findAll());
			return patientRepository.findAll();
			  
	}
		
	@Override
	public List<Doctor> removeDoctor(String userName) {
			Doctor doctor = doctorRepository.findByUserName(userName);
			doctorRepository.delete(doctor);	
			return doctorRepository.findAll();
	}
		
	

}
