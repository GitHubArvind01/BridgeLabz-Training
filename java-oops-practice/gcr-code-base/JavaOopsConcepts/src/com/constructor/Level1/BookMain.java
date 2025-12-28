package com.constructor.Level1;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayBookAccess book = new DisplayBookAccess("978-3-16-148410-0","Automic Habit","James Clear");
		book.displayBook();
		
		System.out.println("----------------Get author----------------");
		System.out.println(book.getAuthor());
		
		System.out.println("---------After change author-----------");
		book.setAuthor("New James Clear");
		book.displayBook();
		
		EBook e = new EBook("978-3-16-148410-0","Automic Habit","James Clear");
		e.displayAccess();
	}
}
