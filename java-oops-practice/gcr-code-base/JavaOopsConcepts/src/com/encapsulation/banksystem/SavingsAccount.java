package com.encapsulation.banksystem;

public class SavingsAccount extends BankAccount implements Loanable{

	public SavingsAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	@Override
	public void applyForLoan(double amount) {
		System.out.println("Savings Account Loan Applied: " + amount);
	}

	@Override
	public double calculateLoanEligibility() {
		return getBalance()*5;
	}

	@Override
	double calculateInterest() {
		return balance*0.04;
	}
	
	
}
