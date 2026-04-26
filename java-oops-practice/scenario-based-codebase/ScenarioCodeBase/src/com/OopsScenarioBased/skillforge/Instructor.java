package com.OopsScenarioBased.skillforge;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Instructor{
	static Map<Integer,ArrayList<Course>> instructorMap = new HashMap<>();
	
	//add instructor
	public void addCourse(int id, Course newCourse) {
		
		if(instructorMap.containsKey(id)) {
			instructorMap.get(id).add(newCourse);
			System.out.println("Added course- "+newCourse.getTitle());
		}else {
			ArrayList<Course> temp = new ArrayList<>();
			temp.add(newCourse);
			instructorMap.put(id,temp);
			System.out.println("Added course -"+newCourse.getTitle());
		}
	}
	
	//view course
	public void viewCourse(int id) {
		System.out.println("-------------------------------Course Details---------------------------------");
		if(instructorMap.containsKey(id)) {
			ArrayList<Course> courseList = instructorMap.get(id);
			int i = 1;
			for(Course courses:courseList) {
				System.out.println("-----Course-> "+(i)+"------------");
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
	
	//view all course
	//view course
	public void viewAllCourse() {
	System.out.println("-------------------------------Course Details---------------------------------");
	for(var instructor : instructorMap.entrySet()) {
			ArrayList<Course> courseList = instructorMap.get(instructor.getKey());
			int i = 1;
			for(Course courses:courseList) {
				System.out.println("-----Course-> "+(i)+"------------");
				System.out.println("Instructor Name: "+courses.getInstructor());
				System.out.println("Coures Title: "+courses.getTitle());
				System.out.println("Courese Id: "+courses.getCourseId());
				System.out.println("Courese rating: "+courses.getRating());
				System.out.println("----------------------");
				i+=1;
			}
		}
		System.out.println("----------------------------------------------------------------------------------");
	}
}