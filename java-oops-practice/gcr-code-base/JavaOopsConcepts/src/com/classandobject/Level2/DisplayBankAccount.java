package com.classandobject.Level2;

public class DisplayBankAccount {
	//Attributes
	private String accountHolder;
	private String accountNumber;
	private double balance;
		
	//constructor
	public DisplayBankAccount(String h, String n, double b){
		this.accountHolder = h;
		this.accountNumber = n;
		this.balance = b;
	}
	
	//creating method to display bank name
	public void displayBank() {
		System.out.println("\t\t\t\tState Bank of India\t\t\t\t");
		
	}
	
	//deposit
	public void depositAmount(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}else {
			System.out.println("Amount should be positive");
		}
	}
	
	//withdraw
	public void withdrawAmount(double amount) {
		if(amount<=balance && amount>0) {
			balance-=amount;
			System.out.println("Withdraw amount is : " + amount);
		}
		else if(amount<=0) {
			System.out.println("Amount should be positive!");
		}
		else {
			System.out.println("Insufficent balance!");
		}
	}
	
	//bank balance
	public void displayBalance() {
		System.out.println("Current Balance: " + balance);
	}
}
