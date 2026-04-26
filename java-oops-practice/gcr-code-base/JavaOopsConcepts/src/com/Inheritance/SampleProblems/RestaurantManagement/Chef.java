package com.Inheritance.SampleProblems.RestaurantManagement;

public class Chef extends Person implements Worker{

	public Chef(String name, String id) {
		super(name, id);
	}
	//method
	public void performDuties() {
		super.showDetails();
		System.out.println("Chef is performing his duty");
		System.out.println("----------------------------");
	}
	
}
