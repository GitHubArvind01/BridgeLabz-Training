package com.constructor.Level1;

public class HotelBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayHotelBooking hotel1 = new DisplayHotelBooking();
		
		DisplayHotelBooking hotel2 = new DisplayHotelBooking("Ram","Standard",2);
		
		DisplayHotelBooking hotel3 = new DisplayHotelBooking(hotel2);
		
		hotel1.displayHotel();
		hotel2.displayHotel();
		hotel3.displayHotel();
	}
}
