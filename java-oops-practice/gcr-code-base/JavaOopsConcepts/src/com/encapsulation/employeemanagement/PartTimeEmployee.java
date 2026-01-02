package com.encapsulation.employeemanagement;

abstract class PartTimeEmployee extends Employee implements Department{
	//attributes
	private int hoursWorked;
    private double hourlyRate;
    private String department;
    
	//constructor
    public PartTimeEmployee(double employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate,
			String department) {
		super(employeeId, name, baseSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		this.setDepartment(department);
	}
    
	//method
	public double calculateSalary() {
		return hoursWorked*hourlyRate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
