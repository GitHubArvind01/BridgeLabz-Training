package com.Inheritance.SampleProblems.Course;

public class Course {
	//attributes
	String courseName;
	double duration;
	
	//constructor
	public Course(String courseName, double duration) {
		this.courseName = courseName;
		this.duration = duration;
	}
	
	//method
	public void displayCourse() {
		System.out.println("------------Display Course--------------");
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration: "+duration);
	}
}
