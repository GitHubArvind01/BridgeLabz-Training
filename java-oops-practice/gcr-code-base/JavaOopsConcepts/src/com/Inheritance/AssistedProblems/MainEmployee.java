package com.Inheritance.AssistedProblems;

public class MainEmployee {

	public static void main(String[] args) {
		Manager m = new Manager("Ram","343",54333,5);
		m.displayDetails();
		
		Developer d = new Developer("allu","0777",5433343,"Java");
		d.displayDetails();
		
		Intern i = new Intern("arvind","543",45322,6);
		i.displayDetails();
	}
}

class Employee{
	//attributes
	String name;
	String id;
	double salary;
	
	//constructor
	Employee(String name, String id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//display
	public void displayDetails() {
		System.out.println("------------------------------------");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Id: "+id);
		System.out.println("Salary: "+salary);
	}
}
class Manager extends Employee{
	//attributes
	int teamSize;
	
	//constructor
	Manager(String name, String id, double salary, int teamSize){
		super(name,id,salary);
		this.teamSize = teamSize;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Team Size: "+teamSize);
		System.out.println("------------------------------------");
	}
	
}
class Developer extends Employee{
	//attributes
	String programmingLanguage;
	
	//constructor
	Developer(String name, String id, double salary, String programmingLanguage){
		super(name,id,salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language: "+programmingLanguage);
		System.out.println("------------------------------------");
	}
	
}

class Intern extends Employee{
	//attributes
	int duration;
	
	//constructor
	Intern(String name, String id, double salary, int duration){
		super(name,id,salary);
		this.duration = duration;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Intern is here duration: "+duration);
		System.out.println("------------------------------------");
	}
}
