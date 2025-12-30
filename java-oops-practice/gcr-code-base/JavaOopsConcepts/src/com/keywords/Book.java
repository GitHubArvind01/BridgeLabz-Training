package com.keywords;

public class Book {
	  // Static variable
	   private static String libraryName;
	   
	   // Instance variables
	   private String title;
	   private String author;
	   private final String isbn;
	   
	   //constructor
	   public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	   }
	   
	   // method to set the library name
	   public static void setLibraryName(String name) {
	       libraryName = name;
	   }
	   
	   // method to display the library name
	   public static void displayLibraryName() {
	       System.out.println("Library Name: " + libraryName);
	   }
	   
	   // Method to display book details
	   public void displayBookDetails() {
	       if (this instanceof Book) {
	           System.out.println("Title: " + title);
	           System.out.println("Author: " + author);
	           System.out.println("ISBN: " + isbn);
	       } else {
	           System.out.println("The object is not an instance of the Book class.");
	       }
	   }
	   
	   //getter and setter 
	   public String getTitle() {
		   return title;
	   }

	   public String getAuthor() {
		   return author;
	   }

	   public String getIsbn() {
		   return isbn;
	   }
}
