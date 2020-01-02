package com.cognizant.DiagnosticMedicare.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognizant.DiagnosticMedicare.model.Medicare;
import com.cognizant.DiagnosticMedicare.model.Request;
import com.cognizant.DiagnosticMedicare.model.TestResult;

@Service
public interface DoctorService {
	
	public boolean addMedicareService(String userName, int medicareService);
	
	public boolean updateTestResult(TestResult testResult);
}
