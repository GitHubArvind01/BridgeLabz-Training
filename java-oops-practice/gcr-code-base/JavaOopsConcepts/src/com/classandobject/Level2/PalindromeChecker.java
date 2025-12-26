package com.classandobject.Level2;

public class PalindromeChecker {

	public static void main(String[] args) {
		//creating object to check the text
		DisplayPalindrome checker1 = new DisplayPalindrome("A man a plan a canal Panama");
		checker1.diplayResult();
		
		 //creating object to check the text
		DisplayPalindrome checker2 = new DisplayPalindrome("Hello");
		checker2.diplayResult();
	}
}
