package com.cognizant.DiagnosticMedicare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.DiagnosticMedicare.model.TestResult;
import com.cognizant.DiagnosticMedicare.repository.TestResultRepository;

@Service
public class TestResultServiceImpl implements TestResultService{

	@Autowired
	TestResultRepository  testResultRepository;
	
	@Override
	public List<TestResult> viewTestResult() {
		
		return testResultRepository.findAll();
	}
	
	

}
