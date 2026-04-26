package com.encapsulation.banksystem;

public interface Loanable {
	void applyForLoan(double amount);
	double calculateLoanEligibility();
}
