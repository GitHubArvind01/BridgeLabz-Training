package com.OopsScenarioBased.campusconnect;

public class Main {

	public static void main(String[] args) {
		
		Course java = new Course("Java",101);
		
		Student stu1 = new Student("allu","allu@gmail.com",1001);
		java.enrollCourse(stu1);
		
		
		Course c = new Course("C",102);
		
		Student stu2 = new Student("kali","kali@gmail.com",1002);
		c.enrollCourse(stu2);
		
		Course cpulsplus = new Course("C++",103);
		
		Student stu3 = new Student("ravi","ravi@gmail.com",1003);
		cpulsplus.enrollCourse(stu3);
		
		
		Course python = new Course("Python",104);
		
		Student stu4 = new Student("ramu","ramu@gmail.com",1004);
		python.enrollCourse(stu4);
		
		Faculty rajaRam = new Faculty("Raja Ram","rajaram@gmail.com",2001);
		rajaRam.addTeacher(java);
		
		rajaRam.showTeacher();
		
	}
}
