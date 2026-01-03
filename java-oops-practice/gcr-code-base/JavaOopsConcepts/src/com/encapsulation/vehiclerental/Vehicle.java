package com.encapsulation.vehiclerental;

abstract class Vehicle {
	
	private String vehicleNumber;
	private String type;
	private double rentalRate;
	
	 // Encapsulation: sensitive field
    private String insurancePolicyNumber;
	
	public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNo) {
 		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
		this.insurancePolicyNumber = policyNo;
	}
	
	abstract double calculateRentalCost(int days);
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRentalRate() {
		return rentalRate;
	}
	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
	
	protected String getPolicyMasked() {
		return "XXXX";
	}
}
