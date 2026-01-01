package com.OopsScenarioBased.Quetion1;

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
	
	
	 //GET CUSTOMER BY ACCOUNT NUMBER (helper method)
    private Customer findCustomer(String accountNumber){
        for(Customer c : customers){
            for(Account a: c.accounts){
                if(a.getAccountNumber().equals(accountNumber)){
                    return c;
                }
            }
        }
        return null;
    }
	
	//withdraw
	public void withdrawAmount(String accountNumber, double amount) {
		Customer c = findCustomer(accountNumber);
		if(c!=null) {
			c.withdrawalAmount(amount, accountNumber);
		}else {
			System.out.println("No account found!");
		}
	}
	
	//deposit
	public void depositAmount(String accountNumber, double amount) {
		Customer c = findCustomer(accountNumber);
		if(c!=null) {
			c.depositAmount(amount, accountNumber);
		}else {
			System.out.println("No account found!");
		}
	}
	
	//view balance
	public void viewBalance(String accountNumber) {
		Customer c = findCustomer(accountNumber);
		if(c!=null) {
			c.viewBalance(accountNumber);
		}else {
			System.out.println("No account found!");
		}
	}
}
