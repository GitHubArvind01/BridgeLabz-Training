package com.Inheritance.SampleProblems.BankAccount;

public class Main {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount("123454323",4324322,2);
		FixedDepositAccount f = new FixedDepositAccount("12332432",44344,3);
		CheckingAccount c = new CheckingAccount("43211233",44223,50);
		
		s.displaySavingAccount();
		f.displayFixedDepositAccount();
		c.displayCheckingAccount();
	}
}
