package com.OopsScenarioBased.campusconnect;
import java.util.*;

class Student extends Person{
	
	private List<Course> enrolledCourses = new ArrayList<>();
	
	
	public Student(String name, String email, int id) {
		super(name, email, id);
	}
	
	protected void addCourse(Course course) {
        enrolledCourses.add(course);
    }
	
	//get all course
	public void getStudentDetails() {
		System.out.println("\n-----------Student Details--------------");
		
		System.out.println("Student name: "+getName());
		for(Course c:enrolledCourses) {
			System.out.println("Enrolled course: "+c.getCourseName());
		}
		System.out.println("----------------------------------------------");
	}
}
