package com.practices.jdbc.employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	private static SingletonConnection instance;
	private Connection connection;
	
	//credentials
	private final static String URL = "jdbc:mysql://localhost:3306/employee";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "alluMysql@071";
	
	private SingletonConnection() {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Database connection success!");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static SingletonConnection getInstance() {
		if(instance==null) {
			instance = new SingletonConnection();
		}
		return instance;
	}
	
	public Connection getConnection() {
		return connection;
	}
}