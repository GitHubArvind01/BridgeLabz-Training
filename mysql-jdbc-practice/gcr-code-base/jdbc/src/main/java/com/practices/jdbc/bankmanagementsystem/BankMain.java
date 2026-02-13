package com.practices.jdbc.bankmanagementsystem;

import java.sql.SQLException;

public class BankMain {

	public static void main(String[] args) {
		BankManagement mangement = new BankManagement();
		try {
			mangement.createAccount(new AccountDTO("RAVI","ASDF54321",13330.0));
			mangement.createAccount(new AccountDTO("KALI","ASDF4532",7830.0));
			mangement.createAccount(new AccountDTO("SURIYA","ASDF8765",6730.0));
			
			mangement.transferMoney("ASDF8765", "ASDF4532", 70);
			
			
			mangement.balanceCheck("ASDF54321");
			
			mangement.checkTransaction("ASDF54321");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}