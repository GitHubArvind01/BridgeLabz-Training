package com.Inheritance.SampleProblems.RestaurantManagement;

public class Person {
	//attributes
	String name;
	String id;
	
	//constructor
	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	//method
	public void showDetails() {
		System.out.println("--------------------Details-------------------");
		System.out.println("Name: "+name);
		System.out.println("Person Id: "+id);
	}
}
