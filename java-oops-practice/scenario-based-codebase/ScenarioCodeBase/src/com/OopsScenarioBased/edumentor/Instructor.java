package com.OopsScenarioBased.edumentor;
import java.util.*;


public class Instructor extends User{
	static int i = 0;
	static ArrayList<Student> students = new ArrayList<>();

	public Instructor(String name, String email, int userId) {
		super(name, email, userId);
	}
	
	//add student so they can play quiz
	public void addStudent(Student student) {
		students.add(student);
	}
	
	//instructor can see the each student data
	public void seeStudentData() {
		System.out.println("------------------Student Result------------------");
		
		for(StudentResult st: Quiz.quizStudentData.values()) {
			System.out.println("Student -> "+(i+1) + " Result");
			System.out.println(st);
			System.out.println("------------------------------------");
			System.out.println();
			i+=1;
		}
	}
}
