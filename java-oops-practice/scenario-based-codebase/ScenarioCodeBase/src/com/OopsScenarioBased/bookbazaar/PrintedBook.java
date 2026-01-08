package com.OopsScenarioBased.bookbazaar;

public class PrintedBook extends Book{

	public PrintedBook(String title, String author, double price, int stock,int bookID) {
		super(title, author, price, stock, "Printed Book",bookID);
	}
}
