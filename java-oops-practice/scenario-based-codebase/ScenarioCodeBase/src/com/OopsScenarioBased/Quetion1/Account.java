package com.OopsScenarioBased.Quetion1;

public class Account {
	private String accountNumber;
	private double balance;
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	//getter and setter
	
	public void setBalance(double amount) {
		balance = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}