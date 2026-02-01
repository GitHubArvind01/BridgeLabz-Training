package com.streamAPI.eventattendeewelcomemessage;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> message = List.of(
				"Arvind",
				"Ravi",
				"Allu",
				"Kali"
				);
		
		message.stream().forEach(name-> System.out.println("Welcome "+name+" to the event."));
	}
}