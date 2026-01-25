package com.regexjunit.extractemail;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

	public static void main(String[] args) {
		String text = "Contact us at support@example.com and info@company.org";
		
		String regex = "[a-z0-9]+@[a-z0-9]+\\.[a-z]{2,}";

		Pattern pattern = Pattern.compile(regex);
				
		Matcher match = pattern.matcher(text);
		
		boolean found = false;
		while(match.find()) {
			System.out.println("Email found: "+match.group());
			found = true;
		}
		
		if(!found) {
			System.out.println("Not found email");
		}
	}
}