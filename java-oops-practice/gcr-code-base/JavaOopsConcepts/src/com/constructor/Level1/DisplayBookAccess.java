package com.constructor.Level1;

public class DisplayBookAccess {
	public String ISBN;
	protected String title;
	private String author;
	
	//constructor
	DisplayBookAccess(String iSBN, String title, String author) {
		this.ISBN = iSBN;
		this.title = title;
		this.author = author;
	}
	
	//getter and setter
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//display
	public void displayBook() {
		System.out.println("ISBN: "+ISBN);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("-------------------");
	}
}

class EBook extends DisplayBookAccess{

	//add super constructor
	EBook(String ISBN, String title, String author){
		super(ISBN,title,author);
	}
	
	//access ISBN and title super
	public void displayAccess() {
		System.out.println("Access Book from subclass: ");
		System.out.println("ISBN: "+ISBN);
		System.out.println("Title: "+title);
		System.out.println("----------------");
	}
}