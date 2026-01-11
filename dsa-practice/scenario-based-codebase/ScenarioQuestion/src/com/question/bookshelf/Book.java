package com.question.bookshelf;

public class Book {
	String title;
	String author;
	double price;
	boolean availability;
	Book next;
	
	public Book(String title, String author, double price, boolean availability) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
		this.next = null;
	}
	
	public void setAvailability(boolean set) {
		this.availability = set;
	}
}
