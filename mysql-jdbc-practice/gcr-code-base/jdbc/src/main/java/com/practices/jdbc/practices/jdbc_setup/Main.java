package com.practices.jdbc.practices.jdbc_setup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	// Database credentials
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";
	private static final String USER = "root";
	private static final String PASSWORD = "alluMysql@071";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Database Connected Success");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) {
		Connection connection = getConnection();
		if(connection==null) {
			try {
				connection.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}