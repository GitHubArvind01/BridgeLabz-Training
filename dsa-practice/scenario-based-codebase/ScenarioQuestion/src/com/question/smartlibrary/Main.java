package com.question.smartlibrary;

public class Main {

	public static void main(String[] args) {
		Book[] books = {new Book("Automic Habit"),new Book("The power of subconcius mind"),new Book("Story of Dark Person"),new Book("Bill Gates"),new Book("World War Two")};
		insertionSort(books,books.length);
		
		
		for(Book b : books) {
			System.out.println(b.title);
		}
	}
	public static void insertionSort(Book books[], int n) {		
		//insertion
		for(int i=1;i<n;i++) {
			String top = books[i].title;
			int j = i-1;
			while(j>=0) {
				if((books[j].title.compareToIgnoreCase(top))>0) {
					books[j+1].title = books[j].title;
					j-=1;
				}else {
					break;
				}
			}
			books[j+1].title = top;
		}
	}
}