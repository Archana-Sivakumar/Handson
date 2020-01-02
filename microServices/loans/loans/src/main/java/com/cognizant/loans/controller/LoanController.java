package com.cognizant.loans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.loans.model.Loan;


@RestController
@RequestMapping
public class LoanController {
	@GetMapping("/loans/{number}")
	public Loan getAccount(@PathVariable String number) {
		
		Loan loan = new Loan("H00987987972342","car",400000,3258, 18 );
		return loan;
	}
}
