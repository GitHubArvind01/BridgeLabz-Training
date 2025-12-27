package com.constructor.Level1;

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayCourse course = new DisplayCourse("Java","150h",5000);
		course.displayCourseDetails();
		
		course.updateInstituteName("ABC School");
		course.displayCourseDetails();
	}
}
