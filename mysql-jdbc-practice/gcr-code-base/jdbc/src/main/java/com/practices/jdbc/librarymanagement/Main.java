package com.practices.jdbc.librarymanagement;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		LibraryManagement management = new LibraryManagement();
		
		
		try {
			management.addUser("surya");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}