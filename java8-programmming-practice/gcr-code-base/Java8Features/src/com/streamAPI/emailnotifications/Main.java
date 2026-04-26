package com.streamAPI.emailnotifications;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = List.of(
					"kali@gmail.com",
					"alice@gmail.com",
					"suriya@gmail.com",
					"arvind@gmail.com",
					"allu@gmail.com",
					"ravi@gmail.com"
				);
		list.stream()
			.forEach(email-> sendEmailNotification(email));
		
	}
	public static void sendEmailNotification(String email) {
		System.out.println("Notification sent success to -> "+email);
	}
}