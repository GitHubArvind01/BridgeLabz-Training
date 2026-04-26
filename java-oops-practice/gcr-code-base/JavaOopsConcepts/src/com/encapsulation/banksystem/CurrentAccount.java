package com.encapsulation.banksystem;

public class CurrentAccount extends BankAccount implements Loanable{

	public CurrentAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	@Override
	public void applyForLoan(double amount) {
		System.out.println("Current Account Loan Applied: " + amount);
	}

	@Override
	public double calculateLoanEligibility() {
		return getBalance()*3;
	}

	@Override
	double calculateInterest() {
		return balance*0.04;
	}
}
