package com.OopsScenarioBased.campusconnect;
import java.util.*
;
public class Faculty extends Person{
	private ArrayList<Course> courseFaculty;;
	
	public Faculty(String name, String email, int id) {
		super(name, email, id);
	}
	
	//add faculty to course
	public void addTeacher(Course c) {
		courseFaculty.add(c);
	}
	
	//show teacher details
	public void showTeacher() {
		System.out.println("\n----------Show faculty details-------");
		for(Course c:courseFaculty) {
			System.out.println("Name: "+getName());
			System.out.println("Teach Course name: "+c.getCourseName());
		}
		
		System.out.println("-----------------------------------------");
	}

}
