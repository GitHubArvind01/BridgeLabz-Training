package com.encapsulation.librarysystem;

abstract class LibraryItem {
	private double itemId;
	protected String title;
	protected String author;
	
	 private String borrowerName;
	 private boolean isAvailable = true;
	 
	public LibraryItem(double itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
	
	abstract double getLoanDuration();
	
	public void getItemDetails() {
		System.out.println("-------------Item Details-----------------");
		System.out.println("Item id: "+itemId);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
	}
	
	
	// protected access for subclasses
    protected void reserve(String name) {
        if (isAvailable) {
            borrowerName = name;
            isAvailable = false;
        }
    }

    protected boolean isAvailable() {
        return isAvailable;
    }

    protected String getBorrowerMasked() {
        return isAvailable ? "Available" : "Borrower: ****";
    }
	
}
