package com.classandobject.Level2;

public class MovieTicket {

	public static void main(String[] args) {
		//Creating the object for constructor
		DisplayMovieTicket ticket1=new DisplayMovieTicket("Dragon");
		
		//calling the method
		ticket1.displayTicket();
		ticket1.bookTicket("A10",120.0);
		ticket1.bookTicket("B10", 120.0);
		ticket1.bookTicket("A11", 120.0);//booking the ticket which is already booked
		ticket1.displayTicket();
	}
}
