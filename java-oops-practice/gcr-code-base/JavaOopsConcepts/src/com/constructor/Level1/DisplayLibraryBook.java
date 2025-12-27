package com.constructor.Level1;

public class DisplayLibraryBook {
	String bookName;
	String author;
	double price;
	boolean availability = true;
	//constructor
	DisplayLibraryBook(String bookName, String author, double price, boolean a){
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.availability = a;
	}
	
	public void borrowBook() {
		if(availability) {
			System.out.println("You have successfully barrow " + bookName);
			availability = false;
		}else {
			System.out.println("Sorry! This book " + bookName+" is barrowed!");
		}
	}
	
	//display book
	public void displayLibarayBookDetails() {
		System.out.println("Book name : " + bookName);
		System.out.println("Author name: " + author);
		System.out.println("Price: "+price);
		System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
		System.out.println("------------------------");
	}
	
}
