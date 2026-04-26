package com.constructor.Level1;

public class DisplayVehicle {
	private String ownerName;
	private String vehicleType;
	
	private static double registrationFee = 190.9;
	//constructor
	DisplayVehicle(String owner, String vehicle){
		this.ownerName = owner;
		this.vehicleType = vehicle;
	}
	
	//displayVehicleDetails
	public void displayVehicleDetails() {
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle type: " + vehicleType);
		System.out.println("updateRegistrationFee: "+ registrationFee);
		System.out.println("--------------------------");
	}
	
	//updateRegistrationFee
	public void updateRegistrationFee(double newFee) {
		this.registrationFee = newFee;
	}
}
