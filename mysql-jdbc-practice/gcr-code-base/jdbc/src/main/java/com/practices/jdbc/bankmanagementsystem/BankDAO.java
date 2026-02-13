package com.practices.jdbc.bankmanagementsystem;

import java.sql.SQLException;

public interface BankDAO {
	
	//create account
	void createAccount(AccountDTO account) throws SQLException;
	
	//transfer money to one account to another account
	void transferMoney(String sender, String reciver, double amount)throws SQLException;
	
	//check balance
	void balanceCheck(String accoutNumber) throws SQLException;
	
	//check transaction history
	void checkTransaction(String accountNumber)throws SQLException;
}
