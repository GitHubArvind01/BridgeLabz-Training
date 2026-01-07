package com.OopsScenarioBased.bookbazaar;
import java.util.*;

public class BookOwner {
	
	static List<Book> bookList = new ArrayList<>();
	//book owner have access to see the list user that borrow book
	//book owner have access to update the book status
	//book owner have authority to manage inventory
	
	
	//add book
	public void addBook(Book newBook) {
		bookList.add(newBook);
		System.out.println("Added Book.");
	}
	
	//remove book
	public void removeBook(Book newBook) {
		bookList.remove(newBook);
		System.out.println("Removed Book.");
	}
	
	//view all book
	public void viewAllBooks() {
		int i = 1;
		System.out.println("-----------------------Full Book List Details-------------------------");
		for(Book b : bookList) {
			System.out.println("------------Book "+(i)+" ------------------");
			System.out.println("Book Title: "+b.getTitle());
			System.out.println("Book Author: "+b.getAuthor());
			System.out.println("Book Type: "+b.getType());
			System.out.println("Book Price: "+b.getPrice());
			System.out.println("Book Stocks: "+b.getStock());
			System.out.println("----------------------------------");
			i+=1;
		}
		System.out.println("-------------------------------------------------------------------");
	}
}
