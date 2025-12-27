package com.constructor.Level1;

public class DisplayBook {
	String bookName;
	String author;
	double price;
	
	//constructor
	DisplayBook(String bookName, String author, double price){
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	//display book
	public void displayBookDetails() {
		System.out.println("Book name : " + bookName);
		System.out.println("Author name: " + author);
		System.out.println("Price: "+price);
		System.out.println("------------------------");
	}
}
