package com.Inheritance.SampleProblems.Course;

public class PaidOnlineCourse extends OnlineCourse{
	//attributes
	double fee;
	double discount;
	
	//constructor
	public PaidOnlineCourse(String courseName, double duration, String platform, String isRecorded, double fee,
			double discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	
	//method
	public void displayCourse() {
		super.displayCourse();
		System.out.println("Fee: "+fee);
		System.out.println("Discount: "+discount);
		System.out.println("---------------------------------------");
	}
}
