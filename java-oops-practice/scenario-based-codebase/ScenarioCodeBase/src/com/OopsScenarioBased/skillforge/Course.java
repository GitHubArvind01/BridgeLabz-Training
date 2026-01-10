package com.OopsScenarioBased.skillforge;

public class Course {
	private String title;
	private int courseId;
	private String instructor;
	private double rating;
	private String modules[];
	public Course(String title, int courseId, String instructor, double rating, String[] modules) {
		this.title = title;
		this.courseId = courseId;
		this.instructor = instructor;
		this.rating = rating;
		this.modules = modules;
	}
	public String getTitle() {
		return title;
	}
	public String getInstructor() {
		return instructor;
	}
	public double getRating() {
		return rating;
	}
	public String[] getModules() {
		return modules;
	}
	public int getCourseId() {
		return courseId;
	}
}