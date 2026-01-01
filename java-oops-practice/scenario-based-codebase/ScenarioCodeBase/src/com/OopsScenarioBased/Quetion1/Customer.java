package com.OopsScenarioBased.Quetion1;

import java.util.ArrayList;

public class Customer {
	String name;
	ArrayList<Account> accounts = new ArrayList<>();
	
	//constructor
	public Customer(String name) {
		this.name = name;
	}

	//add account to the customer
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	//viewBalance
	public void viewBalance(String accountNumber) {
		for(Account ac:accounts) {
			if(ac.getAccountNumber().equals(accountNumber)) {
				System.out.println("\n-------------------------------------------");
				System.out.println("Name: "+name);
				System.out.println("Balance: "+ac.getBalance());
				System.out.println("---------------------------------------------");
			}
		}
	}
	
	//withdrawal amount
	public void withdrawalAmount(double amount, String accountNumber) {
		for(Account ac : accounts) {
			if(ac.getAccountNumber().equals(accountNumber)) {
				double withdraw = ac.getBalance()-amount;
				ac.setBalance(withdraw);
				System.out.println("\n-------------------------------------------");
				System.out.println("Amount Withdrawal Successfull.");
				System.out.println("---------------------------------------------");
			}
		}
	}
	//deposit
	public void depositAmount(double amount, String accountNumber) {
		for(Account ac : accounts) {
			if(ac.getAccountNumber().equals(accountNumber)) {
				double withdraw = ac.getBalance()+amount;
				ac.setBalance(withdraw);
				System.out.println("\n-------------------------------------------");
				System.out.println("Amount Deposit Successfull.");
				System.out.println("---------------------------------------------");
			}
		}
	}
}
