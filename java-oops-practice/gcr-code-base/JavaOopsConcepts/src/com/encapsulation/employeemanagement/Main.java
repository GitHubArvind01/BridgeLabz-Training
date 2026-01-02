package com.encapsulation.employeemanagement;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new FullTimeEmployee(101,"ramu",12000);
		Employee e2 = new PartTimeEmployee(102,"ravi",12);
		
		e1.displayDetails();
		e2.displayDetails();
	}
}