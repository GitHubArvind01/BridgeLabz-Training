package com.linkedlist.studentrecordmanagement;

public class LinkedList {
	private Student head;
	
	//add at the beginning
	public void addBeginning(String name, int rollNumber, int age, char grade) {
		Student newNode = new Student(name,rollNumber,age,grade);
		newNode.next = head;
		head = newNode;
		System.out.println("Added student at beginning!");
	}
	
	//add at the end
	public void addEnd(String name, int rollNumber, int age, char grade) {
		Student newNode = new Student(name,rollNumber,age,grade);
		if(head==null) {
			head = newNode;
			return;
		}
		
		Student temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		System.out.println("Added student at end!");
	}
	
	//add at position
	public void addAtPosition(String name, int rollNumber, int age, char grade, int position) {
		if(position<=1) {
			addBeginning(name,rollNumber,age,grade);
			System.out.println("Added at position!");
			return;
		}
		
		Student newNode = new Student(name,rollNumber,age,grade);
		Student temp = head;
		
		for(int i=1;i<position-1 && temp!=null;i++) {
			temp = temp.next;
		}
		
		if(temp==null) {
			System.out.println("Invalid position!");
			return;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		System.out.println("Added at position!");
	}
	
	//deleted by number
	public void deleteStduent(int rollNumber) {
		if(head==null) {
			return;
		}
		
		if(head.rollNumber==rollNumber) {
			head = head.next;
			return;
		}
		Student temp = head;
		
		while(temp.next!=null && temp.next.rollNumber!=rollNumber) {
			temp = temp.next;
		}
		
		if(temp.next==null) {
			System.out.println("Stduent not found!");
			return;
		}else {
			temp.next = temp.next.next;
		}
	}
	
	//search student by rollNumber
	public void searchByRoll(int rollNumber) {
		if(head==null) {
			return;
		}	
		Student temp = head;
		while(temp!=null) {
			if(temp.rollNumber==rollNumber) {
				System.out.println("\n----------------------Student found---------------------- ");
				printStudent(temp);
				return;
			}
			temp = temp.next;
		}
		
		if(temp==null) {
			System.out.println("Student not found!");
		}
	}
	//update student grade
	public void updateGrade(int rollNumber, char newGrage) {
		if(head==null) {
			System.out.println("Student not found!");
			return;
		}
		
		Student temp = head;
		
		while(temp!=null) {
			if(temp.rollNumber==rollNumber) {
				temp.grade = newGrage;
				System.out.println("Grade Updated success.");
				return;
			}
			temp = temp.next;
		}
		
		if(temp==null) {
			System.out.println("Student not found!");
		}
	}
	//view all student
	public void viewStudent() {
		if(head==null) {
			System.out.println("Student not found!");
			return;
		}
		
		System.out.println("\n-----------------------View All Stduent--------------------");
		Student temp = head;
		while(temp!=null) {
			printStudent(temp);
			temp = temp.next;
		}
	}
	
	//helper function
	public void printStudent(Student s) {
		System.out.println(
				"Name: "+s.name+
				" | Roll Number: "+s.rollNumber+
				" | cAge: "+s.age+
				" | Grade: "+s.grade
		);
		System.out.println("----------------------------------------------------------");
	}
}
