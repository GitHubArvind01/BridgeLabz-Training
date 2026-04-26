package com.OopsScenarioBased.vehiclerental;

public class Bike extends Vehicle implements Rentable{

	public Bike(double baseRate, String vehicleNumber) {
		super(baseRate, vehicleNumber);
	}
	
	public double calculateRent(int days) {
		return days*baseRate;
	}
}
