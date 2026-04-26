package com.practices.jdbc.practices.SingletonPatternConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			DatabaseConnectionSingleton dbInstance = DatabaseConnectionSingleton.getInstance();
			Connection connection = dbInstance.getConnection();
			System.out.println("Database connection success....");
			
			if(connection!=null && !connection.isClosed()) {
				System.out.println("Connectio obtained in main()!");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}