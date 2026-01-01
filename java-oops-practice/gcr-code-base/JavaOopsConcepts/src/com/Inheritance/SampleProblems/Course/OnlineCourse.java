package com.Inheritance.SampleProblems.Course;

public class OnlineCourse extends Course {
	//attributes
	String platform;
	String isRecorded;
	//constructor
	public OnlineCourse(String courseName, double duration, String platform, String isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}

	//method
	public void displayCourse() {
		super.displayCourse();
		System.out.println("Platform: "+platform);
		System.out.println("Recorded: "+isRecorded);
	}
}
