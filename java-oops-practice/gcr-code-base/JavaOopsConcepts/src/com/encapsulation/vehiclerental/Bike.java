package com.encapsulation.vehiclerental;

public class Bike extends Vehicle implements Insurable{
	
	public Bike(String vehicleNumber, double rentalRate, String policyNo) {
		super(vehicleNumber, "Bike", rentalRate, policyNo);
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
