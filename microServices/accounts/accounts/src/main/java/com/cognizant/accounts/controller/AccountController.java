package com.cognizant.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.accounts.model.Account;


@RestController
@RequestMapping
public class AccountController {

	@GetMapping("/accounts/{number}")
	public Account getAccount(@PathVariable String number) {
		
		Account account = new Account("00987987973432","savings",234343);
		return account;
	}
	}

