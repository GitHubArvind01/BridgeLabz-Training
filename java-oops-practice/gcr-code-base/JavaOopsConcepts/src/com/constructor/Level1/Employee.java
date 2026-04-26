package com.constructor.Level1;

public class Employee {
	public String employeeID;
	protected String department;
	private double salary;
	
	Employee(String employeeID, String department, double salary) {
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	//modify salary
	public void modifySalary(double newSalary) {
		this.salary = newSalary;
	}
	
	//display
	public void displayEmployee() {
		System.out.println("\n---------Employee Details------------");
		System.out.println("Employee Id: "+ employeeID);
		System.out.println("Department: "+department);
		System.out.println("salary: "+salary);
		System.out.println("----------------------------------------");
	}
}

class Manager extends Employee{
	public String teamName;
	Manager(String employeeID, String department, double salary, String teamName) {
		super(employeeID, department, salary);
		this.teamName = teamName;
	}
	
	//display
	public void displayManger() {
		System.out.println("\n---------Manager Access Details------------");
		System.out.println("Employee Id: "+ employeeID);
		System.out.println("Department: "+department);
		System.out.println("Salary (via getter): " + getSalary());
        System.out.println("Managing Team: " + teamName);
		System.out.println("----------------------------------------");
	}
	
}