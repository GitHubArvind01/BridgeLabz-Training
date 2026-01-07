package com.OopsScenarioBased.bookbazaar;

public class User {
	private String userName;
	private String address;
	
	public User(String userName, String address) {
		this.userName = userName;
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public String getAddress() {
		return address;
	}
}
