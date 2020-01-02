package com.cognizant.DiagnosticMedicare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.DiagnosticMedicare.model.TestResult;

@Service
public interface TestResultService {

	public List<TestResult> viewTestResult();
}
