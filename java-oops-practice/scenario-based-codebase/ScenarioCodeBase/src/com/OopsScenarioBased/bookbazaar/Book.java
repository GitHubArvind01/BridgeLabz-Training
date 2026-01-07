package com.OopsScenarioBased.bookbazaar;

public class Book {
	//attributes
	private String title;
	private String author;
	private double price;
	private int stock;
	private String type;
	
	//constructor
	public Book(String title, String author, double price, int stock, String type) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
		this.type = type;
	}

	//getter
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}	
	
	public String getType() {
		return type;
	}
}
