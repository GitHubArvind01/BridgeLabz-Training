package com.objectmodeling.AssistedProblems.schoolresults;

public class Main {

	public static void main(String[] args) {
		 // Creating Student object
        Student student = new Student(1, "John");

        // Creating Subject objects
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Adding subjects to student
        student.addSubject(maths);
        student.addSubject(science);

        
        // Grade calculation
        GradeCalculator calculator = new GradeCalculator();
        student.requestGrade(calculator);
	}
}
