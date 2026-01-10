package com.OopsScenarioBased.skillforge;

import java.util.*;

public class Student {
	
	private int id;
	private int courseId;
	
	static Map<Integer,ArrayList<Course>> studentEnroll = new HashMap<>();
	
	public Student(int id, int courseId) {
		this.id = id;
		this.courseId = courseId;
	}
	
	//enroll in course
	public void enrollStudent(int studentId, int courseId) {
		for(var instructor : Instructor.instructorMap.entrySet()) {
			ArrayList<Course> courseList = Instructor.instructorMap.get(instructor.getKey());
			for(Course courses:courseList) {
				if(courses.getCourseId()==courseId) {
					if(studentEnroll.containsKey(studentId)) {
						studentEnroll.get(studentId).add(courses);
						System.out.println("Success enrolled course -"+courses.getTitle());
					}
					else {
						ArrayList<Course> course = new ArrayList<>();
						course.add(courses);
						studentEnroll.put(studentId, course);
						System.out.println("Success enrolled course -"+courses.getTitle());
					}
					return;
				}
			}
		}
		System.out.println("Course id my not found!");
	}
	
	//view student enrolled course
	public void viewEnroll(int studentId) {
		System.out.println("-------------------------------Enroll Course Details---------------------------------");
		if(studentEnroll.containsKey(id)) {
			ArrayList<Course> courseList = studentEnroll.get(id);
			int i = 1;
			for(Course courses:courseList) {
				System.out.println("-----Course Enrolled -> "+(i)+"------------");
				System.out.println("Coures Title: "+courses.getTitle());
				System.out.println("Courese Id: "+courses.getCourseId());
				System.out.println("Courese rating: "+courses.getRating());
				System.out.println("----------------------");
				i+=1;
			}
		}
		else {
			System.out.println("Id not found!");
		}
		System.out.println("----------------------------------------------------------------------------------");
	}
}