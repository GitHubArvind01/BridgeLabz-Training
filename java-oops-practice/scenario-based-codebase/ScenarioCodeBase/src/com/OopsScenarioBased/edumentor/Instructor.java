package com.OopsScenarioBased.edumentor;
import java.util.*;

public class Instructor extends User{
	
	ArrayList<Student> students = new ArrayList<>();

	public Instructor(String name, String email, int userId) {
		super(name, email, userId);
	}
	
	//add student so they can play quiz
	public void addStudent(Student student) {
		students.add(student);
	}
}
