package com.encapsulation.librarysystem;

public class DVD extends LibraryItem implements Reservable {

	public DVD(double itemId, String title, String author) {
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
		return 3;
	}
	
	
}
