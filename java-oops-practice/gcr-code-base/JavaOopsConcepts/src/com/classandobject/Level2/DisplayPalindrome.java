package com.classandobject.Level2;

public class DisplayPalindrome {
	//Attribute
	String text;
	
	//Creating the method check Palindrome
	DisplayPalindrome(String text) {
		this.text=text;
		
	}
	//Creating the method to check its Palindrome or not
	public boolean isPalindrome() {
		//To remove the space and return consistent text
		String cleantext=text.replaceAll("\\s","").toLowerCase();
		
		//to reverse the string
		String reverseText=new StringBuilder(cleantext).reverse().toString();
		
		return cleantext.equals(reverseText);
	}
	public void diplayResult() {
		if(isPalindrome()) {
			System.out.println(text+" ---is palindrome");
		}
		else {
			System.out.println(text+" ----is not palindrome");
		}
	}
}
