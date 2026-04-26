package com.question.bookshelf;

public class LinkedList {
	
	Book head;
	
	//add book
	public void addBook(String title, String author, double price, boolean availability) {
		Book newBook = new Book(title,author,price, true);
		
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
			System.out.println("Availabiliy: "+temp.availability);
			temp = temp.next;
		}
	}
	
	//search book by title
	public boolean searchBook(String title) {
		Book temp = head;
		
		while(temp!=null) {
			if(temp.title.equals(title)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	//delete book
	public void borrow(String title) {
		if(head==null) {
			System.out.println("Book list empty!");
			return;
		}
		
		Book temp = head;
		
		while(temp!=null) {
			if(temp.title.equals(title)) {
				System.out.println("Book borowed success.");
				temp.setAvailability(false);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book title not found!");
	}
	
	//return book
	public void returnBook(String title) {
		if(head==null) {
			System.out.println("Book list empty!");
			return;
		}
		
		Book temp = head;
		
		while(temp!=null) {
			if(temp.title.equals(title)) {
				System.out.println("Book return success.");
				temp.setAvailability(true);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book title not found!");
	}
}
