package com.cognizant.DiagnosticMedicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.DiagnosticMedicare.model.Admin;
import com.cognizant.DiagnosticMedicare.model.TestResult;


@Repository
public interface TestResultRepository  extends JpaRepository<TestResult, Integer> {


	TestResult findById(int id);

}
