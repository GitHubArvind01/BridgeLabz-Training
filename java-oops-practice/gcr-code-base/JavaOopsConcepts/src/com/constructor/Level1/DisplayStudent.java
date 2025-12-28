package com.constructor.Level1;

public class DisplayStudent {
	private int rollNumber;
	protected String name;
	private double CGPA;
	
	//constructor
	DisplayStudent(int rollNumber, String name, double cGPA) {
		this.rollNumber = rollNumber;
		this.name = name;
		CGPA = cGPA;
	}
	
	
	//get -> CGPA
	public double getCGPA() {
		return CGPA;
	}
	
	//modify -> CGPA
	public void modifyCGPA(double newCGPA) {
		if(newCGPA>0.0 && newCGPA<=10.0) {
			this.CGPA = newCGPA;
		}
		else {
			System.out.println("Invalid! CGPA");
		}
	}
	
	//display the student data
	public void displayStudent() {
		System.out.println("Stduent Name: " + name);
		System.out.println("Stduent roll number: " + rollNumber);
		System.out.println("CGPA: " + CGPA);
		System.out.println("--------------------");
	}
}
class PostgraduateStudent extends DisplayStudent{
	public String Specialization;
	
	//constructor
	PostgraduateStudent(int rollNumber, String name, double CGPA, String Specialization){
		super(rollNumber,name,CGPA);
		this.Specialization = Specialization;
	}
	
	//display
	public void displayPGDetails() {
		System.out.println("PG student name(Protected Access) : "+ name);
		System.out.println("Specialization: "+Specialization);
		System.out.println("----------------------------");
	}
}

