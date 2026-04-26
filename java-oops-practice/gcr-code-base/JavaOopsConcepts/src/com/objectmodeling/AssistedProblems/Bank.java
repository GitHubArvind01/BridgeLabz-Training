package com.objectmodeling.AssistedProblems;
import java.util.ArrayList;

public class Bank {
	private String bankName;
	
	ArrayList<Customer> customers = new ArrayList<>();
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	
	 //such as openAccount() in the Bank class
	public void openAccount(Customer customer, Account account) {
		if(!customers.contains(customer)) {
			customers.add(customer);
		}
		customer.addAccount(account);
		
		System.out.println("\n----------------------------------");
		System.out.println("Account opened: "+ customer.getName());
		System.out.println("------------------------------------");
	}
	
	//show all customer
	public void showCustomer() {
		System.out.println("\n----------------------------------");
		System.out.println("All customer of "+bankName);
		for(Customer cs : customers) {
			System.out.println(cs.getName());
		}
		System.out.println("----------------------------------");
	}
}
