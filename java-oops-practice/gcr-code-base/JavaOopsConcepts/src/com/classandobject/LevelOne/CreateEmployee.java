package com.classandobject.LevelOne;

public class CreateEmployee {
	String name;
	int id;
	int salary;
	
	//constructor
	CreateEmployee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void displayData() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee id: " + id);
		System.out.println("Employee salary: " + salary);
	}
}
