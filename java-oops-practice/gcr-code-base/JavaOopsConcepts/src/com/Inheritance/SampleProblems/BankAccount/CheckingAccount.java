package com.Inheritance.SampleProblems.BankAccount;

public class CheckingAccount extends BankAccount{
	//attributes
	int withdrawalLimit; 
	//constructor

	public CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}
	
	//method to display
	public void displayCheckingAccount() {
		System.out.println("\n------------Account Type (Checking)-------------");
		super.displayBankAccount();
		System.out.println("Withdrawal Limits: "+withdrawalLimit);
		System.out.println("-------------------------------------------------");
	}
}
