package com.tree.universitydigitalrecord;

public class Main {

	public static void main(String[] args) {
		UniversityRecord u = new UniversityRecord();
		u.addStudent(101, "ravi", 75.43);
		u.addStudent(102, "kali", 55.88);
		
		u.viewStudent();
		
		u.searchStudentByRollNumber(1001);
		
		
	}
}