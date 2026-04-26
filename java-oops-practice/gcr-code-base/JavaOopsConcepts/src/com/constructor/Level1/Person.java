package com.constructor.Level1;

public class Person {
	public static void main(String args[]) {
		//constructor 1
		DisplayPerson person1 = new DisplayPerson("Allu",120);
		
		//constructor 2
		DisplayPerson person2 = new DisplayPerson(person1);
		
		
		person1.displayperson();
		person2.displayperson();
		
		//modification
		person1.setName("hello");
		System.out.println("After modify name : ");
		person1.displayperson();
		person2.displayperson();
		
	}
}
