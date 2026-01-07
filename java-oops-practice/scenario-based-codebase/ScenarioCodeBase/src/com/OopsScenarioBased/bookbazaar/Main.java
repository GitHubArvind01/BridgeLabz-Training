package com.OopsScenarioBased.bookbazaar;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Book object
		Book ebook1 = new EBook("Automic Habit","James Clear",499,10);
		Book ebook2 = new EBook("Rich Dad Poor Dad","Robort T. Kiyosaki",399,5);
		Book ebook3 = new EBook("The Power of Subconscious Mind","Joseph Murphy",699,50);
		Book printedBook1 = new PrintedBook("ASDF","Temp King",1499,101);
		Book printedBook2 = new PrintedBook("RFRFRF","TTTTTT",4199,2);
		
		//BookOwner can add book, remove, and manage inventory
		BookOwner owner = new BookOwner();
		owner.addBook(ebook1);
		owner.addBook(ebook2);
		owner.addBook(ebook3);
		owner.addBook(printedBook1);
		owner.addBook(printedBook2);
		
		
		
		//here work start
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("For Borrow Book-> enter 'B' : ");
			System.out.println("For return Book-> enter 'R' : ");
			System.out.println("See the -> enter 'C': ");
			System.out.println("For exit quiz -> enter 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'S':

					break;
				case 'A':

					break;
				case 'C':

					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
