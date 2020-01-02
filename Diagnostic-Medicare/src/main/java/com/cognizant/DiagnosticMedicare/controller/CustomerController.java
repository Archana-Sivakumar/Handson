package com.cognizant.DiagnosticMedicare.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.DiagnosticMedicare.DiagnosticMedicareApplication;
import com.cognizant.DiagnosticMedicare.model.Doctor;
import com.cognizant.DiagnosticMedicare.model.Patient;
import com.cognizant.DiagnosticMedicare.model.Request;
import com.cognizant.DiagnosticMedicare.model.TestResult;
import com.cognizant.DiagnosticMedicare.service.AdminService;
import com.cognizant.DiagnosticMedicare.service.RequestService;
import com.cognizant.DiagnosticMedicare.service.TestResultService;

@RestController
@RequestMapping("")

public class CustomerController {
	private static final Logger LOGGER = LoggerFactory.getLogger(DiagnosticMedicareApplication.class);
	
	@Autowired
	private RequestService requestService;
	
	@Autowired
	private TestResultService testResultService;
	
	
	@GetMapping("/customerViewRequest/{customerId}")
	public List<Request> customerRequest(@PathVariable int customerId){
		return requestService.customerRequest(customerId);	
	}

	@PostMapping("/request")
	public boolean addRequest(@RequestBody Request request){
		 return requestService.addRequest(request);
	}
	
	@GetMapping("/oneRequest/{id}")
	public Request getOneRequest(@PathVariable int id){
		return requestService.getOneRequest(id);
	}
	@GetMapping("/getOneCustomer/{customerName}")
	public Patient getOneCustomer(@PathVariable String customerName){
		return requestService.getOneCustomer(customerName);
	}

	@PostMapping("/bookAppointment")
	public boolean bookAppointment(@RequestBody Request request) {
		LOGGER.info("Start");
		LOGGER.info("End");
		
		return requestService.bookAppointment(request);
	
	}
	
	@GetMapping("/viewTestResult")
	public List<TestResult> viewTestResult() {
		return testResultService.viewTestResult();
	}

}
