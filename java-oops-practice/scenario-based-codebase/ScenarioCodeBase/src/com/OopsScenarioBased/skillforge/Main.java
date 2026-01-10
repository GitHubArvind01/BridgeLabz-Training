package com.OopsScenarioBased.skillforge;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int instructorId = 1001;
	static int studentId = 101;
	static int courseId = 10001;
	

	public static void main(String[] args) {
		Instructor instructor = new Instructor();

		//here work start
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("Add Course-> enter 'C' : ");
			System.out.println("Instructor Course List view -> enter 'I': ");
			System.out.println("Enroll Course-> enter 'S' : ");
			System.out.println("Student courese enrolled List view -> enter 'L': ");
			System.out.println("View All Course-> enter 'A': ");
			System.out.println("For exit quiz -> enter 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			sc.nextLine();
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'C':
					System.out.println("Enter your course title: ");
					String title = sc.nextLine();
					
					System.out.println("Enter you name: ");
					String name = sc.nextLine();
					
					System.out.println("Enter you modules size: ");
					int size = sc.nextInt();
					
					String modules[] = new String[size];
					System.out.println("Enter modules "+(size)+" name: ");
					for(int i=0;i<size;i++) {
						modules[i] = sc.nextLine();
					}
					
					System.out.println("-----Pleaes Choose last Option----");
					System.out.println("New Instructor-> enter 'N': ");
					System.out.println("Already Have instructor Id-> enter 'H': ");
					char instruct = sc.next().charAt(0);
					instruct = Character.toUpperCase(instruct);
					sc.nextLine();
					
					if(instruct!='H' && instruct!='N') {
						System.out.println("Invalid options!");
						break;
					}
					
					if(instruct=='H') {
						System.out.println("Please Enter your instructor id: ");
						int instructId= sc.nextInt();
						Course newCourse = new Course(title,randomcourseId(),name,0.0,modules);
						instructor.addCourse(instructId, newCourse);
						break;
					}
					if(instruct=='N') {
						int coureseId = randomcourseId();
						int instructorId = randominstructorId();
						Course newCourse = new Course(title,coureseId,name,0.0,modules);
						instructor.addCourse(instructorId, newCourse);
						System.out.println("Your instructor Id is: "+instructorId);
						break;
					}
					break;
				case 'I':
					System.out.println("Enter your instructor id: ");
					int instructId = sc.nextInt();
					instructor.viewCourse(instructId);
					break;
				case 'S':	
					System.out.println("-----Pleaes Choose last Option----");
					System.out.println("New Student-> enter 'N': ");
					System.out.println("Already Have student Id-> enter 'H': ");
					
					char stu = sc.next().charAt(0);
					stu = Character.toUpperCase(stu);
					sc.nextLine();
					
					if(stu!='H' && stu!='N') {
						System.out.println("Invalid options!");
						break;
					}
					
					if(stu=='H') {
						System.out.println("please enter your student id: ");
						int stuId = sc.nextInt();
						
						System.out.println("Enter course id to enroll: ");
						int courseId = sc.nextInt();
						
						Student st = new Student(stuId,courseId);
						st.enrollStudent(stuId,courseId);
						break;
					}
					if(stu=='N') {
						System.out.println("Enter course id to enroll: ");
						int courseId = sc.nextInt();
						int randomStuId = randomstudentId();
						Student st = new Student(randomStuId,courseId);
						st.enrollStudent(randomStuId,courseId);
						System.out.println("Your student id is: "+randomStuId);
						break;
					}
					break;
				case 'L':
					System.out.println("please enter your student id: ");
					int stuId = sc.nextInt();
					Student st = new Student(stuId,0);
					st.viewEnroll(stuId);
					//student can see their enrolled course
					break;
				case 'A':
					//student can see all course list
					instructor.viewAllCourse();
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
	
	//generate random id
	public static int randomstudentId() {
		return studentId+=1;
	}
	
	public static int randominstructorId() {
		return instructorId+=1;
	}
	public static int randomcourseId() {
		return courseId+=1;
	}
}