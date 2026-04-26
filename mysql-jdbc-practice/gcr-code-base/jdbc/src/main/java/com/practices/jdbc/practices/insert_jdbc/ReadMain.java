package com.practices.jdbc.practices.insert_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReadMain {

	// Database credentials
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";
	private static final String USER = "root";
	private static final String PASSWORD = "alluMysql@071";
		
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
			
			System.out.println("Data base Connection success..");
			String SQL = "INSERT INTO users(name,email) VALUES (?,?)";
			
			PreparedStatement ps = connection.prepareStatement(SQL);
			ps.setString(1, "Allu");
			ps.setString(2, "arvind@gmail.com");
			
			ps.executeUpdate();
			
			System.out.println("User data inserted! you can mannually in mysql terminal");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}