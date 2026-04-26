package com.OopsScenarioBased.bookbazaar;

public class EBook extends Book{

	public EBook(String title, String author, double price, int stock, int bookID) {
		super(title, author, price, stock, "Ebook", bookID);
	}
}
