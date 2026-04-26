package com.objectmodeling.AssistedProblems;

public class Account {
	private String accountNumber;
	private double balance;
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	//view the account 
	public void viewBalance() {
		System.out.println("\n-------------------------------------------");
		System.out.println("Account Number: "+ accountNumber + "\n"+"Balance: "+balance);
		System.out.println("---------------------------------------------");
	}
}
