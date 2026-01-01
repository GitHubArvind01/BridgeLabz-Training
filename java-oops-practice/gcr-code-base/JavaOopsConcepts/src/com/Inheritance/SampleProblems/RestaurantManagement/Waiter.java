package com.Inheritance.SampleProblems.RestaurantManagement;

public class Waiter extends Person implements Worker{

	public Waiter(String name, String id) {
		super(name, id);
	}
	
	//method
	public void performDuties() {
		super.showDetails();
		System.out.println("Waiter performing his duty");
		System.out.println("----------------------------");
	}
}
