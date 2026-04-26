package com.OopsScenarioBased.vehiclerental;

public class Car extends Vehicle implements Rentable{

	public Car(double baseRate, String vehicleNumber) {
		super(baseRate, vehicleNumber);
	}

	@Override
	public double calculateRent(int days) {
		return days*baseRate + 500;
	}
}
