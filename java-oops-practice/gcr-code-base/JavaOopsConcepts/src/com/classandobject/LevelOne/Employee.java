package com.classandobject.LevelOne;

public class Employee {
	
	String name;
	int id;
	int salary;
	
	//constructor
	Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void displayData() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee id: " + id);
		System.out.println("Employee salary: " + salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("allu",1,20000);
		
		employee.displayData();
	}

}
