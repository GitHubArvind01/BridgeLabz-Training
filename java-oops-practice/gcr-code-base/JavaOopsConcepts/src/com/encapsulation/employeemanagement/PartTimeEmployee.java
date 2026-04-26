package com.encapsulation.employeemanagement;

public class PartTimeEmployee extends Employee{
	//attributes
	private int hoursWorked;
	private static final double RATE_PER_HOUR = 500; // fixed rupees
    
	//constructor
    public PartTimeEmployee(double employeeId, String name, int hoursWorked) {
		super(employeeId, name);
		this.hoursWorked = hoursWorked;
	}
    
	//method
	public double calculateSalary() {
		return hoursWorked*RATE_PER_HOUR;
	}
}
