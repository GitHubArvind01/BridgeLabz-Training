package com.constructor.Level1;


public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayBook book1= new DisplayBook("Automic Habits", "Jemes clear", 500);
		DisplayBook book2=new DisplayBook("The power of your subconscious mind","Joseph Murphy",  500);

		book1.displayBookDetails();
		book2.displayBookDetails();
	}
}
