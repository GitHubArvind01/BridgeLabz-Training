package com.question.bookshelf;

public class Book {
	String title;
	String author;
	double price;
	Book next;
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.next = null;
	}
}
