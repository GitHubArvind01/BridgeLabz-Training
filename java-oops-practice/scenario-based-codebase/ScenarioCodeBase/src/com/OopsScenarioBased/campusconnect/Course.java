package com.OopsScenarioBased.campusconnect;
import java.util.*;

public class Course implements ICourseAction{
	private String courseName;
	private int courseId;
	
	private List<Student> students = new ArrayList<>();
	private List<Faculty> facultys = new ArrayList<>();
	
	
	public Course(String courseName, int courseId) {
		this.courseName = courseName;
		this.courseId = courseId;
	}

	
	public String getCourseName() {
		return courseName;
	}

	public int getCourseId() {
		return courseId;
	}


	@Override
	public void enrollCourse(Student student) {
		students.add(student);
		student.addCourse(this);
		System.out.println("You have successfull enrolled! Course Name: "+courseName);
	}

	@Override
	public void dropCourse(Student student) {
		students.remove(student);
		System.out.println("You exit with course name: "+courseName);
	}
	
	public void addFaculty(Faculty faculty) {
		facultys.add(faculty);
	}
}
