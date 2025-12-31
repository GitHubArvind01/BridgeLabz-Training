package com.objectmodeling.AssistedProblems;
import java.util.ArrayList;

public class Customer {
	private String name;
	ArrayList<Account> accounts = new ArrayList<>();
	
	//constructor
	public Customer(String name) {
		this.name = name;
	}

	//add account to the customer
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	//view all account
	public void viewAllAccounts() {
		System.out.println("\n--------------------------------");
		System.out.println("view all accounts of - " +name);
		for(Account ac:accounts) {
			ac.viewBalance();
		}
		System.out.println("----------------------------------");
	}
	
	//getter
	public String getName() {
		return name;
	}
}
