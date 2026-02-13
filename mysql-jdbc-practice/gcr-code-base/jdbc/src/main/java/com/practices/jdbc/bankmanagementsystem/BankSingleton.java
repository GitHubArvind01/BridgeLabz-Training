package com.practices.jdbc.bankmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankSingleton {
	private static BankSingleton instance;
	private Connection connection;
	
	private final static String URL = "jdbc:mysql://localhost:3306/bankmanagement";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "alluMysql@071";
	
	private BankSingleton() {
		try {
			this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//get instance
	public static BankSingleton getInstance() {
		if(instance==null) {
			instance = new BankSingleton();
		}
		return instance;
	}
	
	//get connection
	public Connection getConnection() {
		return connection;
	}
}
