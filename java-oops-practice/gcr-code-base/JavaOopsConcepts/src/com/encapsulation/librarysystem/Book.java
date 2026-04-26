package com.encapsulation.librarysystem;

public class Book extends LibraryItem implements Reservable{
	
	public Book(double itemId, String title, String author) {
		super(itemId, title, author);
	}

	@Override
	public void reserveItem(String borrowerName) {
		reserve(borrowerName);
        System.out.println("Book reserved");
	}

	@Override
	public boolean checkAvailability() {
		return isAvailable();
	}

	@Override
	double getLoanDuration() {
		return 14;
	}
	
}
