package com.classandobject.Level2;

public class BankAccount {

	public static void main(String[] args) {
		 //Creating a BankAccount object
		
	     DisplayBankAccount account = new DisplayBankAccount("Lynda", "123456789", 700.00);
	     account.displayBank();
	     
	     // Display initial balance
	       account.displayBalance();
	       // Deposit money
	       account.depositAmount(200.00);
	       account.displayBalance();
	       // Withdraw money
	       account.withdrawAmount(100.00);
	       account.displayBalance();
	       // Try to withdraw more than the available balance
	       account.withdrawAmount(900.00);

	}
}
