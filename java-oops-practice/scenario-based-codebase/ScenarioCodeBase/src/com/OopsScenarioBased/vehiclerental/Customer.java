package com.OopsScenarioBased.vehiclerental;

public class Customer {
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void rentVehicle(Rentable vehicle, int days) {
        System.out.println("Customer: " + name);
        System.out.println("Total Rent: " + vehicle.calculateRent(days));
        System.out.println("--------------------------------");
    }
}
