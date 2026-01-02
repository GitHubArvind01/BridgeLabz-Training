package com.encapsulation.employeemanagement;

abstract class FullTimeEmployee extends Employee implements Department{
	//attributes
	private String department;
	
	//constructor
	public FullTimeEmployee(double employeeId, String name, double baseSalary) {
		super(employeeId, name, baseSalary);
	}
	
	//method
	public double calculateSalary() {
		return getBaseSalary();
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
