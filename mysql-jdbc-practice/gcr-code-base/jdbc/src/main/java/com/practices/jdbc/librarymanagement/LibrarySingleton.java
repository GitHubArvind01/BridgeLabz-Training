package com.practices.jdbc.librarymanagement;
import java.sql.*;
import java.sql.SQLException;
public class LibrarySingleton {
	private static LibrarySingleton instance;
	private Connection connection;
	
	//data base fields
	private final static String URL = "jdbc:mysql://localhost:3306/librarymanagement";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "alluMysql@071";
	
	//private constructor
	private LibrarySingleton() {
		try {
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("Database connection success.");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//get instance
	public static LibrarySingleton getInstance() {
		if(instance==null) {
			instance = new LibrarySingleton();
		}
		return instance;
	}
	
	//get connection
	public Connection getConnection() {
		return connection;
	}
}
