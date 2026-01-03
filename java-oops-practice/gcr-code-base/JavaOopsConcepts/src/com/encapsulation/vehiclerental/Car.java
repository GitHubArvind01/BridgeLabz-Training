package com.encapsulation.vehiclerental;

public class Car extends Vehicle implements Insurable{

	public Car(String vehicleNumber, double rentalRate, String policyNo) {
		super(vehicleNumber, "Car", rentalRate, policyNo);
	}

	@Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // extra load charge
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance | " + getPolicyMasked();
    }
}
