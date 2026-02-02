package com.questions.student_schoolsystem;

import java.util.ArrayList;
import java.util.List;

public class StudentDataCenter {
	List<Student> studentList = new ArrayList<>();
	
	//add student
	public void add(Student s) {
		studentList.add(s);
	}
}