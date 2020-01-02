package com.cognizant.accounts.model;

public class Account {
	private String number;
	private String type;
	private long balance;
	
	
	 public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account(String number, String type, long balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public long getBalance() {
		return balance;
	}


	public void setBalance(long balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [number=" + number + ", type=" + type + ", balance=" + balance + "]";
	}


	
	
	
}
