package com.classandobject.Level2;

public class StudentsGrades {
	String name;
	String rollNumber;
	double[] marks;
	
	//Creating constructor
	StudentsGrades(String name,String rollNumber,double[] marks) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	
	//creating method to calculate grade
	public String calculateGrade(double[] marks ) {
		//variable to store the total marks
		double totalMarks = calculateTotalMarks(marks);
		
		//to check the grade of student
		if(totalMarks >= 80 && totalMarks<=100) {
			return "Grade A";
		}
		else if((totalMarks >=60)&&(totalMarks <80)){
			return "Grade B";
		}
		else if((totalMarks >=50)&&(totalMarks <60)) {
			return "Grade C";
		}
		else if((totalMarks >=40)&&(totalMarks <50)) {
			return "Grade D";
		}
		else {
			return "Grade F";
		}
	}
	//creating the method to calculate the total marks
	public double calculateTotalMarks(double[] marks)
	{
		double totalSum = 0;
		for(int i=0;i < marks.length ; i++ ) {
			totalSum+=marks[i];
		}
		return totalSum/3;
	}
	
	//Creating the method to display the students details
	public void displayStudent() {
		System.out.println("Student Name: "+name);
		
		System.out.println("Student RollNumber: "+rollNumber);
		
		System.out.println("Student Marks:");
		
		for(int i=0;i < marks.length ; i++ ) {
			System.out.println("Mark"+(i+1)+": "+marks[i]);
		}
		
		System.out.println(calculateGrade(marks));
		System.out.println("------------------------------");
	}
}
