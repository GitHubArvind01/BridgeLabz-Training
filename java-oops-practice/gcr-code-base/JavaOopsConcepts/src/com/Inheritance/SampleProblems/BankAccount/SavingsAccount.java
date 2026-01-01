package com.Inheritance.SampleProblems.BankAccount;

public class SavingsAccount extends BankAccount {
	//attributes
	double interestRate;
	
	//constructor
	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	//method
	public void displaySavingAccount() {
		System.out.println("\n------------Account Type (Saving)--------------");
		super.displayBankAccount();
		System.out.println("Interest Rate: "+interestRate+"%");
		System.out.println("-------------------------------------------------");
	}
}
