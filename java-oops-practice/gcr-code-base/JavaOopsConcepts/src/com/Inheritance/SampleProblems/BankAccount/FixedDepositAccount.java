package com.Inheritance.SampleProblems.BankAccount;

public class FixedDepositAccount extends BankAccount{
	//attributes
	double year;
	//constructor
	public FixedDepositAccount(String accountNumber, double balance, double year) {
		super(accountNumber, balance);
		this.year = year;
	}
	
	
	//method to displayFixedDepositAccount
	public void displayFixedDepositAccount() {
		System.out.println("\n-------------Account Type (Fixed)-----------------");
		super.displayBankAccount();
		System.out.println("Amount Fixed for "+year+" Year");
		System.out.println("-------------------------------------------------");
	}
}
