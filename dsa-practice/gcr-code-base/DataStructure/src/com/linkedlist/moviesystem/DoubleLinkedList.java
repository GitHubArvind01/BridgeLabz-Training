package com.linkedlist.moviesystem;

public class DoubleLinkedList {
	Movie head;
	
	//add movie at beginning
	public void addAtBeginnig(String title, String director, int yor, float rating) {
		Movie m = new Movie(title,director,yor,rating);
		if(head==null) {
			head = m;
			System.out.println("Added moive at the beginning: "+m.movieTitle);
			return;
		}
		Movie temp = head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		m.prev = temp;
		temp.next = m;
		System.out.println("Added moive at the beginning: "+m.movieTitle);
		return;
	}
	
	
	//remove movie by movieTitle
	public void removeMoive(String title) {
		if(head==null) {
			System.out.println("\nMoive list is empty!");
			return;
		}
		
		Movie temp = head;
		
		if(temp.movieTitle.equals(title)) {
			head = temp.next;
			 if (head != null) {
				 head.prev = null;
	        }

	        System.out.println("\nRemoved movie : " + temp.movieTitle);
	        return;
		}
		while(temp!=null) {
			if(temp.movieTitle.equals(title)) {
				if(temp.next!=null) {
					temp.next.prev = temp.prev;
				}
				if(temp.prev!=null) {
					temp.prev.next = temp.next;
				}
				System.out.println("\nRemoved movie : "+temp.movieTitle);
				return;
			}
			temp = temp.next;
		}
		if(temp==null) {
			System.out.println("\nMovie not found!");
			return;
		}
	}
	
	//search movie by director or rating
	public void searchMovie(String director, float rating) {
		if(head.Director==director && head.rating==rating) {
			System.out.println("\n-----Moive found-----");
			displayMoive(head);
			return;
		}
		
		Movie temp = head;
		while(temp!=null) {
			if(temp.Director.equals(director) && temp.rating==rating) {
				displayMoive(temp);
				return;
			}
			temp = temp.next;
		}
		
		if(temp==null) {
			System.out.println("\nMoive title not found!");
		}
	}
	
	//display all movie
	public void displayAllMoive() {
		Movie temp = head;
		System.out.println("\n---------------Display All Moive-----------------");
		while(temp!=null) {
			displayMoive(temp);
			temp = temp.next;
		}
		System.out.println("--------------------------------------------------");
	}
	
	//display all movie forward or reversed
	public void displayMoive(Movie m) {
		System.out.println(
				"Movie Title: "+m.movieTitle+
				" | Movie Director: "+m.Director +
				" | Year of release: "+m.YOR+
				" | Rating: "+m.rating
		);
	}
	//update movie rating by movie title
	public void updateRating(String title, float rating) {
		if(head.movieTitle.equals(title)) {
			head.rating = rating;
			System.out.println("\nUpdated rating.");
			return;
		}
		
		Movie temp = head;
		while(temp!=null) {
			if(temp.movieTitle.equals(title)) {
				temp.rating = rating;
				System.out.println("\nUpdated rating.");
				return;
			}
			temp = temp.next;
		}
	}
}
