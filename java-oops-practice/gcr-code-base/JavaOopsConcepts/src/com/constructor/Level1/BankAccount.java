package com.constructor.Level1;

public class BankAccount {
	public String accountNumber;
	protected String accountHolder;
	private double balance;
	
	//constructor
	BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	//get -> balance
	public double getBalance() {
		return balance;
	}
	
	//set -> balance
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	//deposit
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		}
		else {
			System.out.println("Invalid Amount!");
		}
	}
	
	//withdraw
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance!");
		}
		else if(amount<0) {
			System.out.println("Invalid amount! Amount should be positive.");
		}
		else {
			balance-=amount;
		}
	}
	//display
	public void displayAccount() {
		System.out.println("\n-----------Account Details---------------");
		System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
        System.out.println("-----------------------------");
	}
	
}

class SavingsAccount extends BankAccount{
	public double interestRate;
	//constructor
	SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate){
		super(accountNumber,accountHolder,balance);
		this.interestRate = interestRate;
	}
	
	public void displaySavingDetails() {
		System.out.println("\n-------------Saving Account details---------");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Balance (via getter): "+getBalance());
		System.out.println("Interest Rate : "+interestRate);
		System.out.println("------------------------------------");
	}
}
