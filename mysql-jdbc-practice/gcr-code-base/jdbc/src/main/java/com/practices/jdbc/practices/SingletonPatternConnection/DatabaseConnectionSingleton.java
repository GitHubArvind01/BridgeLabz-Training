package com.practices.jdbc.practices.SingletonPatternConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionSingleton {
	private static DatabaseConnectionSingleton instance;
	private Connection connection;
	
	// Database credentials
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";
	private static final String USER = "root";
	private static final String PASSWORD = "alluMysql@071";
	
	DatabaseConnectionSingleton() throws SQLException{
		try {
			this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static DatabaseConnectionSingleton getInstance() throws SQLException{
		if(instance==null || instance.getConnection().isClosed()) {
			instance = new DatabaseConnectionSingleton();
		}
		return instance;
	}
	
	public Connection getConnection() {
		return connection;
	}
}
