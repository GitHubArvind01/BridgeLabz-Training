package com.constructor.Level1;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount("434343343","allu",334344);
		b.displayAccount();
		b.deposit(5000);
		b.withdraw(432);
		
		System.out.println("\n-------Get balance--------------");
		System.out.println(b.getBalance());
		
		System.out.println("\n-----------Set balance=43----------");
		b.setBalance(43);
		b.displayAccount();
		
	    System.out.println("\n==== Savings Account ====");
        SavingsAccount sAcc = new SavingsAccount("SAV98765", "Rahul Sharma", 10000, 4.5);
        sAcc.displaySavingDetails();
	}
}
