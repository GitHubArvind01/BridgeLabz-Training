package com.OopsScenarioBased.ridesystem;

public class Main {

	public static void main(String[] args) {
		Driver driver = new Driver("Arvind", "DL12345", 4.8);

        Vehicle myCar = new Sedan("KA01AB1234");

        IRideService rideService = new CabService();

        rideService.bookRide(driver, myCar, 12);
        rideService.endRide();
	}
}
