package com.constructor.Level1;

public class DisplayCarRental {
	
	private String customerName;
	private String carModel;
	private int rentalDays;
	private double costPerDay;
	
	//constructor
	DisplayCarRental(String name, String model, int days, double costPerDay){
		this.customerName = name;
		this.carModel = model;
		this.rentalDays = days;
		this.costPerDay = costPerDay;
	}
	
	//rent cost
	public void rentalCost() {
		double cost = costPerDay*rentalDays;
		System.out.println("Customer Name: "+customerName);
		System.out.println("Car Model: " + carModel);
		System.out.println("Rental Days: " + rentalDays);
		System.out.println("Cost per days: "+costPerDay);
		System.out.println("Total Cost: " + cost);
		System.out.println("----------------------------");
	}
}
