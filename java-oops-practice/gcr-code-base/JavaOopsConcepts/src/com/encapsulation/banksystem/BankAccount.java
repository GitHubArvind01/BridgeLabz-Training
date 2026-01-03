package com.encapsulation.banksystem;

abstract class BankAccount {
	String accountNumber;
	String holderName;
	double balance;
	
	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	//concrete method
	public void deposit(double amount) {
		balance += amount;
        System.out.println("Deposited: " + amount);
	}
	
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance-=amount;
			System.out.println("Withdrawal Success: "+amount);
		}
	}
	
	//abstract method
	abstract double calculateInterest();

	//getter and setter
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}
	public double getBalance() {
		return balance;
	}
}
