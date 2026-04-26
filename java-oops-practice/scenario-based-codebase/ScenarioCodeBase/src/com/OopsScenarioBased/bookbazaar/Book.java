package com.OopsScenarioBased.bookbazaar;

public class Book {
	//attributes
	private String title;
	private String author;
	private double price;
	private int stock;
	private String type;
	private int bookID;
	
	//constructor
	public Book(String title, String author, double price, int stock, String type, int bookID) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
		this.type = type;
		this.bookID = bookID;
	}

	//getter
	public String getTitle() {
		return title;
	}
	
	public int getBookID() {
		return bookID;
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
	
	public void setStockTemp(int q) {
		this.stock = q;
	}
	
	public String getType() {
		return type;
	}

	public void setStock(int newStock) {
		this.stock-=stock;
	}
	
	public void updateStock(int newStock) {
		this.stock+=newStock;
	}
}
