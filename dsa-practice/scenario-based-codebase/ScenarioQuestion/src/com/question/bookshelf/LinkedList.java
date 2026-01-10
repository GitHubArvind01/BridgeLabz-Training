package com.question.bookshelf;

public class LinkedList {
	
	Book head;
	
	//add book
	public void addBook(String title, String author, double price) {
		Book newBook = new Book(title,author,price);
		
		if(head==null) {
			head = newBook;
			return;
		}
		Book temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.next = newBook;
	}
	
	//view Book
	public void viewBook() {
		Book temp = head;
		while(temp!=null) {
			System.out.println("\nBook title: "+temp.title);
			System.out.println("Author: "+temp.author);
			System.out.println("price: "+temp.price);
			temp = temp.next;
		}
	}
}
