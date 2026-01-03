package com.encapsulation.vehiclerental;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR-INS-001"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-002"));
        vehicles.add(new Truck("TRUCK303", 3000, "TRUCK-INS-003"));

        int days = 5;

        for (Vehicle v : vehicles) {
            Insurable i = (Insurable) v;

            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Rental Cost: " + v.calculateRentalCost(days));
            System.out.println("Insurance Cost: " + i.calculateInsurance());
            System.out.println("Insurance Details: " + i.getInsuranceDetails());
            System.out.println("--------------------------------");
        }
	}
}
