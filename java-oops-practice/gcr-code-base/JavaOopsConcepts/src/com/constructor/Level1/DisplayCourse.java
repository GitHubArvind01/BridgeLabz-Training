package com.constructor.Level1;

public class DisplayCourse {
	private String courseName;
	private String duration;
	private double fee;
	static String instituteName = "Default School";
	
	//constructor
	DisplayCourse(String c, String d, double f){
		this.courseName = c;
		this.duration = d;
		this.fee = f;
	}
	
	//updateInstituteName
	public void updateInstituteName(String name) {
		this.instituteName = name;
	}
	
	//displayCourseDetails
	public void displayCourseDetails() {
		System.out.println("Institute Name: "+ instituteName);
		System.out.println("Course Name: "+courseName);
		System.out.println("Course Duration: "+duration);
		System.out.println("Fee: "+fee);
		System.out.println("-------------------");
	}
	
}
