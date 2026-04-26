package com.OopsScenarioBased.vehiclerental;

public class Truck extends Vehicle implements Rentable{

	public Truck(double baseRate, String vehicleNumber) {
		super(baseRate, vehicleNumber);
	}

	@Override
	public double calculateRent(int days) {
		return days*baseRate+ (days*1000);
	}
}
