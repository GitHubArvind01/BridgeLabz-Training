package com.OopsScenarioBased.vehiclerental;

public class Vehicle {
	protected double baseRate;
	protected String vehicleNumber;
	
	public Vehicle(double baseRate, String vehicleNumber) {
		this.baseRate = baseRate;
		this.vehicleNumber = vehicleNumber;
	}

	public double getBaseRate() {
		return baseRate;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}
}
