package com.constructor.Level1;

public class DisplayPerson {
	private String name;
	private int roll;
	
	//constructor1
	DisplayPerson(String n, int r){
		setName(n);
		roll = r;
	}
	
	
	
	//constructor2
	DisplayPerson(DisplayPerson displayPerson){
		this.setName(displayPerson.getName());
		this.roll = displayPerson.roll;
	}
	
	//display
	public void displayperson() {
		System.out.println("Name: " + getName());
		System.out.println("Roll: " + roll);
		System.out.println("---------------");
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
}
