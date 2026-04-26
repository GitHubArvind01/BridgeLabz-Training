package com.constructor.Level1;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayVehicle vehicle = new DisplayVehicle("Allu","Two-wheel");
		
		vehicle.displayVehicleDetails();
		
		vehicle.updateRegistrationFee(797.3);
		vehicle.displayVehicleDetails();
	}
}
