package com.linkedlist.studentrecordmanagement;

public class Student {
	public String name;
	public int rollNumber;
	public int age;
	public char grade;
	public Student next;
	
	public Student(String name, int rollNumber, int age, char grade) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}
