package com.question.bookshelf;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Library newBook = new Library();
		
		//here work start
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("Add book-> please enter 'A' : ");
			System.out.println("Borrow Book-> please enter 'B' : ");
			System.out.println("Return Book-> enter 'R': ");
			System.out.println("View Book by genre-> enter 'I': ");
			System.out.println("View All books-> enter 'V': ");
			System.out.println("For exit quiz -> enter 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			sc.nextLine();
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'A':
					System.out.println("Enter book genre: ");
					String addGenre = sc.nextLine();
					
					System.out.println("Enter Book title: ");
					String addTitle = sc.nextLine();
					
					System.out.println("Enter author name: ");
					String addAuthor = sc.nextLine();
					
					System.out.println("Enter the price:");
					double addPrice = sc.nextDouble();
					newBook.addBooks(addGenre, addTitle, addAuthor, addPrice);
					break;
				case 'B':
					System.out.println("Enter book genre: ");
					String borrowGenre = sc.nextLine();
					
					System.out.println("Enter Book title: ");
					String borrowTitle = sc.nextLine();
					
					newBook.borrowBook(borrowGenre, borrowTitle);
					break;
				case 'R':
					
					break;
				case 'I':
					System.out.println("Enter book genre: ");
					String viewGenre = sc.nextLine();
					newBook.viewBooksByGenre(viewGenre);
					break;
				case 'V':
					newBook.viewALLBooks();
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
