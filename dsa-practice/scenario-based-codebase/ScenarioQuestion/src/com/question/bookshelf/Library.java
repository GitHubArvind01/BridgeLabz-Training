package com.question.bookshelf;
import java.util.*;

public class Library {
	static Map<String,LinkedList> booksList = new HashMap<>();
	
	//add book to map
	public void addBooks(String genre, String title, String author, double price) {
		if(booksList.containsKey(genre)) {
			booksList.get(genre).addBook(title, author, price);
			System.out.println("Booked Added!");
		}else {
			LinkedList newBook = new LinkedList();
			newBook.addBook(title, author, price);
			booksList.put(genre, newBook);
			System.out.println("Booked Added!");
		}
	}
}
