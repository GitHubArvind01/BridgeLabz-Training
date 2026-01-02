package com.encapsulation.employeemanagement;

abstract class Employee {
	//attributes
	private double employeeId;
	private String name;
	private double baseSalary;
	//constructor
	public Employee(double employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.setBaseSalary(baseSalary);
	}
	
	//getter and setter
	public double getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(double employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//abstract method
	abstract double calculateSalary();
		
	//concrete method
	public void displayDetails() {
		System.out.println("--------------Employee Details----------------");
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+name);
		System.out.println("Salary: "+calculateSalary());
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
}
