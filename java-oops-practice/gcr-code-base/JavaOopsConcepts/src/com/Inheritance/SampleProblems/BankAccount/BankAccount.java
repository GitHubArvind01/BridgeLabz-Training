package com.Inheritance.SampleProblems.BankAccount;

public class BankAccount {
	//attributes
	String accountNumber;
	double balance;
	
	//constructor
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//method
	public void displayBankAccount() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}
