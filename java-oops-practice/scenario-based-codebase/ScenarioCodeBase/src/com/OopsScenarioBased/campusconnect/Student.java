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
	public List<Course> getEnrolledCourse(){
		return enrolledCourses;
	}
}
