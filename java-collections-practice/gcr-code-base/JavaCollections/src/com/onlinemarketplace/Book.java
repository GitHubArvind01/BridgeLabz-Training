package com.onlinemarketplace;
enum BookCategory {
    EDUCATION, FICTION, NON_FICTION
}
public class Book extends Product<BookCategory>{

	public Book(String name, double price, com.onlinemarketplace.BookCategory category) {
		super(name, price, category);
	}
}
