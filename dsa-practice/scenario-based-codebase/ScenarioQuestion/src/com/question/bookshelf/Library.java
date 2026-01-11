package com.question.bookshelf;
import java.util.*;

public class Library {
	static Map<String,LinkedList> booksList = new HashMap<>();
	
	//add book to map
	public void addBooks(String genre, String title, String author, double price) {
		if(booksList.containsKey(genre)) {
			booksList.get(genre).addBook(title, author, price, true);
			System.out.println("Booked Added!");
		}else {
			LinkedList newBook = new LinkedList();
			newBook.addBook(title, author, price,true);
			booksList.put(genre, newBook);
			System.out.println("Booked Added!");
		}
	}
	
	//borrow book
	public void borrowBook(String genre, String title) {
		if(booksList.containsKey(genre)) {
			booksList.get(genre).borrow(title);
		}else {
			System.out.println("Sorry! Book genre not found!");
		}
	}
	
	//return book
	public void returnBooks(String genre, String title) {
		if(booksList.containsKey(genre)) {
			booksList.get(genre).returnBook(title);
		}
		else {
			System.out.println("book genre not found!");
		}
	}
	
	//view all book
	public void viewALLBooks() {
		System.out.println("----------------------------All Book List-------------------------");
		for(var books:booksList.entrySet()) {
			System.out.println("----Books Genre "+(books.getKey())+"------");
			books.getValue().viewBook();
			System.out.println("---------------------");
		}
		System.out.println("------------------------------------------------------------------");
	}
	
	//view book by genre
	public void viewBooksByGenre(String genre) {
		if(booksList.containsKey(genre)) {
			System.out.println("Book genre: "+genre);
			booksList.get(genre).viewBook();
		}else {
			System.out.println("Book genre not found!");
		}
	}
}
