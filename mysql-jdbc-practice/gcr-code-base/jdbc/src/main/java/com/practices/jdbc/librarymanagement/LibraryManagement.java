package com.practices.jdbc.librarymanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryManagement {
	LibrarySingleton singleton = LibrarySingleton.getInstance();
	Connection connection = singleton.getConnection();
	//user can create 
	public void addUser(String name) throws SQLException{
		String sql = "INSERT INTO user (userName) VALUES (?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, name);
		statement.executeUpdate();
		ResultSet result = connection.prepareStatement("SELECT * FROM user").executeQuery();
		if(result.next()) {
			System.out.println("User added with id "+result.getInt("userId"));
		}
	}
	
	//user can borrow book
}
