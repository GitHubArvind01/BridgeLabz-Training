package com.practices.jdbc.bankmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankManagement implements BankDAO{
	BankSingleton singleton = BankSingleton.getInstance();
	Connection connection = singleton.getConnection();
	
	@Override
	public void createAccount(AccountDTO account) throws SQLException{
	    String sql = "INSERT INTO accounts (accountHolderName, accountNumber, balance) VALUES (?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, account.getAccountHolderName());
		statement.setString(2, account.getAccountNumber());
		statement.setDouble(3, account.getBalance());
		int row = statement.executeUpdate();
		if(row>0) {
			System.out.println("Account create success with account number: "+account.getAccountNumber());
		}
	}
	
	@Override
	public void transferMoney(String sender, String receiver, double amount) throws SQLException{
		try {
			
			//start transaction true
			connection.setAutoCommit(false);
			
			//deduct from sender
			String sql1 = "UPDATE accounts SET balance = balance - ? WHERE accountNumber = ?";
			PreparedStatement statement1 = connection.prepareStatement(sql1);
			statement1.setDouble(1, amount);
			statement1.setString(2, sender);
			int row1 = statement1.executeUpdate();
			
			//added to receiver
			String sql2 = "UPDATE accounts SET balance = balance + ? WHERE accountNumber = ?";
			PreparedStatement statement2 = connection.prepareStatement(sql2);
			statement2.setDouble(1, amount);
			statement2.setString(2, receiver);
			int row2 = statement2.executeUpdate();
			
			//add transaction
			String sql3 = "INSERT INTO transactions(sender_accountNumber, revicer_accountNumber, amount) VALUES (?, ?, ?)";
			PreparedStatement statement3 = connection.prepareStatement(sql3);
			statement3.setString(1, sender);
			statement3.setString(2, receiver);
			statement3.setDouble(3, amount);
			statement3.executeUpdate();
			
			  // Check if both updates worked
	        if (row1 == 0 || row2 == 0) {
	            throw new SQLException("Invalid account number!");
	        }
	        
			connection.commit();
			System.out.println("Transaction completed!");
		}
		catch(SQLException e) {
			 connection.rollback(); // If anything fails
		     System.out.println(e.getMessage());
		}
		finally {
			connection.setAutoCommit(true);
		}
	}

	@Override
	public void balanceCheck(String accountNumber) throws SQLException{
		String sql = "SELECT * FROM accounts WHERE accountNumber = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, accountNumber);
		ResultSet result = statement.executeQuery();
		// Move the cursor to the first row
        if (result.next()) {
            // Now it is safe to retrieve data
            AccountDTO dto = new AccountDTO(
                result.getString("accountHolderName"), 
                result.getString("accountNumber"), 
                result.getDouble("balance")
            );
            System.out.println("Current Balance for " + accountNumber + ": " + dto.getBalance());
        } else {
            System.out.println("Error: Account number " + accountNumber + " not found.");
        }
	}

	@Override
	public void checkTransaction(String accountNumber) throws SQLException{
		String sql = "SELECT " +
	             "s.accountHolderName AS sender_name, " +
	             "s.accountNumber AS sender_account, " +
	             "r.accountHolderName AS receiver_name, " +
	             "r.accountNumber AS receiver_account, " +
	             "t.amount " +
	             "FROM transactions t " +
	             "JOIN accounts s ON t.sender_accountNumber = s.accountNumber " +
	             "JOIN accounts r ON t.revicer_accountNumber = r.accountNumber " +
	             "WHERE t.sender_accountNumber = ? ";

		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, accountNumber);
		ResultSet result = statement.executeQuery();
		// Move the cursor to the first row
        while (result.next()) {
            System.out.println(result.getString("sender_name")+" | "+result.getString("sender_account")+" | "+result.getString("receiver_name")+" | "+result.getString("receiver_account")+" | "+result.getString("amount"));
        }
	}
}
