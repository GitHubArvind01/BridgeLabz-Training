package com.constructor.Level1;

public class LibraryBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayLibraryBook book1= new DisplayLibraryBook("Automic Habits", "Jemes clear", 500,true);
		
		book1.borrowBook();
		book1.displayLibarayBookDetails();
		
		DisplayLibraryBook book2=new DisplayLibraryBook("The power of your subconscious mind","Joseph Murphy", 5000,true);

		book2.borrowBook();
		book2.displayLibarayBookDetails();
	}
}
