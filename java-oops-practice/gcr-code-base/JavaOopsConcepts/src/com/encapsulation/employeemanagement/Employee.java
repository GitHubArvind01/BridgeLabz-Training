package com.encapsulation.employeemanagement;

abstract class Employee {
	//attributes
	private double employeeId;
	private String name;
	protected double baseSalary;
	
	//constructor
	public Employee(double employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}
	
	//getter and setter
	public double getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}
	
	//abstract method
	abstract double calculateSalary();
		
	//concrete method
	public void displayDetails() {
		System.out.println("--------------Employee Details----------------");
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+name);
		System.out.println("Salary: "+calculateSalary());
		System.out.println("-----------------------------------------------");
	}
}
