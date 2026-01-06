package com.OopsScenarioBased.edumentor;
import java.util.*;

public class Main {
	//scanner object
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//quiz object
		Quiz quiz = new Quiz();
		
		//student object
		Student ram = new Student("ram","ram@gamil.com",101);
		Student ravi = new Student("ravi","ravi@gamil.com",102);
		Student allu = new Student("allu","allu@gamil.com",103);
		
		//instructor
		Instructor kali = new Instructor("Kali Sir","kali@gmail.com",201);
		kali.addStudent(ram);
		kali.addStudent(ravi);
		kali.addStudent(allu);
		
		//here work start
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("Want to solve MCQ-> please enter 'S' : ");
			System.out.println("Want to see progress-> please enter 'A' : ");
			System.out.println("Want to see Certificate-> enter 'C': ");
			System.out.println("For exit quiz -> enter 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'S':
					System.out.println("Enter your ID: ");
					
					//call the showQuestion method
					quiz.showQuestion();
					break;
				case 'A':
					quiz.showAnswer();
					break;
				case 'C':
					quiz.generateCertificate();
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
