package com.encapsulation.vehiclerental;

public class Truck extends Vehicle implements Insurable{

	public Truck(String vehicleNumber, double rentalRate, String policyNo) {
		super(vehicleNumber, "Truck", rentalRate, policyNo);
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
