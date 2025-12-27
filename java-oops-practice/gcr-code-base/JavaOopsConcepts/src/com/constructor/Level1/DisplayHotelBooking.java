package com.constructor.Level1;

public class DisplayHotelBooking {
	private String guestName;
	private String roomType;
	private int nights;
	
	// default constructor
	DisplayHotelBooking(){
		this.guestName = "Unkown";
		this.roomType = "Standard";
		this.nights = 1;
	}
	
	//parameter constructor
	DisplayHotelBooking(String g, String r, int n){
		this.guestName = g;
		this.roomType = r;
		this.nights = n;
	}
	
	//copy constructor
	DisplayHotelBooking(DisplayHotelBooking display){
		this.guestName = display.guestName;
		this.roomType = display.roomType;
		this.nights = display.nights;
	}
	
	public void displayHotel() {
		System.out.println("Guest Name: "+guestName);
		System.out.println("Room Type: "+roomType);
		System.out.println("Night: "+nights);
		System.out.println("------------------------");
	}
}
