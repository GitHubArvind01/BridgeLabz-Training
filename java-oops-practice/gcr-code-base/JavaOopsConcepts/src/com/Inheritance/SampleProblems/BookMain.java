package com.Inheritance.SampleProblems;

public class BookMain {
	public static void main(String args[]) {
		Author b2 = new Author("Automic Habit","2015","James clear","A great book writer");
		b2.displayInfo();
	}
}

class Book{
	String title;
	String publicationYear;
	
	public Book(String title, String publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}
	public void displayInfo(){}
}
class Author extends Book{
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