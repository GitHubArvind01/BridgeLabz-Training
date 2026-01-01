package com.Inheritance.SampleProblems.Book;

public class Author extends Book{
	String name;
	String bio;
	
	Author(String title, String publicationYear, String name, String bio){
		super(title,publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	//display info
	public void displayInfo() {
		System.out.println("------------------------------------");
		System.out.println("Book title: "+title);
		System.out.println("Publication Year: "+publicationYear);
		System.out.println("Author name: "+name);
		System.out.println("Bio: "+bio);
		System.out.println("------------------------------------");
	}
}