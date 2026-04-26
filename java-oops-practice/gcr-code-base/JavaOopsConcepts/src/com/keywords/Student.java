package com.keywords;

public class Student {
	 // Static variable shared across all instances
	   private static String universityName;
	   private static int totalStudents = 0;
	   // Instance variables
	   private final int rollNumber; // Final variable to ensure the roll number cannot be changed
	   private String name;
	   private char grade;
	   
	   

	public Student(int rollNumber, String name, char grade) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.grade = grade;
		totalStudents++;
	}
	
	//set university Name
	public static void setUniversityName(String Name) {
		universityName = Name;
	}
	
	//print total student
	public static void displayTotalStudents() {
		System.out.println("Total Stduent: "+ totalStudents);
	}
	
	// Method to display student details
    public void displayStudentDetails() {
       // Using 'instance of' to verify the object's type before displaying details
       if (this instanceof Student) {
           System.out.println("University Name: " + universityName);
           System.out.println("Roll Number: " + rollNumber);
           System.out.println("Name: " + name);
           System.out.println("Grade: " + grade);
       } else {
           System.out.println("The object is not an instance of the Student class.");
       }
    }
    
    

    public void setGrade(char grade) {
		if(this instanceof Student) {
			this.grade = grade;
			System.out.println("Grade updated to: "+grade);
		}else {
			 System.out.println("The object is not an instance of the Student class.");
		}
	}

	//getter and setter
	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public char getGrade() {
		return grade;
	}

	public static void main(String[] args) {
	   // Set the university name (static variable)
       Student.setUniversityName("Global University");
       // Create new student instances
       Student student1 = new Student(101,"allu",'A');
       Student student2 = new Student(102,"arvind" ,'B');
       // Display total number of students enrolled
       Student.displayTotalStudents();
       // Display student details
       student1.displayStudentDetails();
       System.out.println();
       
       student2.displayStudentDetails();
       // Update student grade
       student2.setGrade('A');
       System.out.println();
       // Display updated student details
       student2.displayStudentDetails();
	}
}
