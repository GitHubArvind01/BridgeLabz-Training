package com.encapsulation.employeemanagement;

public class FullTimeEmployee extends Employee{
	//constructor
	public FullTimeEmployee(double employeeId, String name, double baseSalary) {
		super(employeeId, name);
		this.baseSalary = baseSalary;
	}
	
	//method
	public double calculateSalary() {
		return baseSalary;
	}
}
