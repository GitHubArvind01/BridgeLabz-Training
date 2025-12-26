package com.classandobject.Level2;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//store marks
		double[] mark1 = {80,70,75};
		double[] mark2 = {60,65,50};

		StudentsGrades grade1 = new StudentsGrades("Arvind","50",mark1);
		StudentsGrades grade2 = new StudentsGrades("allu","150",mark2);
		
		grade1.displayStudent();
		grade2.displayStudent();
	}
}
