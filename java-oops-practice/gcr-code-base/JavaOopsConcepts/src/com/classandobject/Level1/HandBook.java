package com.classandobject.Level1;

public class HandBook {
	String bookTitle;
	String bookAuthor;
	double price;
	
	//constructor
	HandBook(String bookTitle,String bookAuthor,double price){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	
	//creating the method to display the output
	public void displayBookDetails() {
		System.out.println("------------------------------");
		System.out.println("Title of the book: "+bookTitle);
		System.out.println("Author of the book: "+bookAuthor);
		System.out.println("Price of the book: "+price);
	}

}
