package com.encapsulation.banksystem;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB101", "Arvind", 50000));
        accounts.add(new CurrentAccount("CA202", "Kumar", 100000));

        for (BankAccount acc : accounts) {
            acc.deposit(5000);
            acc.withdraw(2000);

            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());

            Loanable loan = (Loanable) acc;
            loan.applyForLoan(20000);
            System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());

            System.out.println("----------------------------------");
        }
	}
}
