package com.OopsScenarioBased.skillforge;
import java.util.*;

public class Student {
	
	private String userName;
	private int courseId;
	
	static Map<Integer,ArrayList<Course>> studentEnroll = new HashMap<>();
	
	public Student(String userName, int courseId) {
		this.userName = userName;
		this.courseId = courseId;
	}
	
	//enroll in course
	public void enrollStudent(int courseId) {
		
	}
}
