package com.objectmodeling.AssistedProblems;

public class BankMain {

	public static void main(String[] args) {
		//created object of bank
		Bank bank = new Bank("State Bank of India");
		
		//create customer
		Customer c1 = new Customer("Arvind");
		Customer c2 = new Customer("Allu");
		
		//create multiple accounts
		Account a1 = new Account("12345",4033);
		Account a2 = new Account("54321",4939);
		Account a3 = new Account("43322",4322);
		
		//now open account for each customer
		bank.openAccount(c1, a1);
		bank.openAccount(c1, a2);
		bank.openAccount(c2, a3);
		
		//now check for each customer have all account
		c1.viewAllAccounts();
		c2.viewAllAccounts();
		
		//show SBI all customer
		bank.showCustomer();
		
	}
}
