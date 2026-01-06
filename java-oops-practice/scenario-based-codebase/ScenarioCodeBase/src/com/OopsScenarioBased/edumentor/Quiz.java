package com.OopsScenarioBased.edumentor;
import java.util.*;

public class Quiz {
	
	static Scanner sc = new Scanner(System.in);
	
	static String[] question = {"Which planet is known as the 'Red Planet'?","What is the chemical symbol for water?","Who is known as the Father of the Indian Constitution?","What is the process by which plants make their food?","Which is the largest ocean in the world?"};
	
	private final static char[] answer = {'B','B','C','C','D'};
	
	private static char[] userAnswer = new char[5];
	
	private final static String[][] options = {
		{"(A) Venus","(B) Mars","(C) Jupiter","(D) Saturn"},
			{"(A) O2","(B) H2O","(C) CO2","(D) N2"},
				{"(A) Mahatma Gandhi","(B) Jawaharlal Nehru","(C) B. R. Ambedkar","(D) Sardar Patel"},
					{"(A) Respiration","(B) Transpiration","(C) Photosynthesis","(D) Fermentation"},
						{"(A) Atlantic Ocean","(B) Indian Ocean","(C) Arctic Ocean","(D) Pacific Ocean"},
	};
	
	List<Student> quizStudentData = new ArrayList<>();
	
	public void showQuestion() {
		for(int i=0;i<5;i++){
			System.out.println("\n---------------Question."+(i+1)+"--------------");
			System.out.println(question[i]);
			System.out.println("Chose Option");
			for(int j=0;j<4;j++){
				System.out.println(options[i][j]);
			}
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			userAnswer[i] = c;
			//call method to validate the option
		}
		validateOuput();
	}
	//this method validate the option
	public void validateOuput(){
		int correct = 0;
		int incorrect = 0;
		for(int i=0;i<5;i++){
			if(answer[i]==userAnswer[i]){
				correct+=1;
			}else{
				incorrect+=1;
			}
		}
		System.out.println("\n---------------Final Result--------------");
		System.out.println("Correct Questions: "+correct);
		System.out.println("Incorrect Questions: "+incorrect);
	}
	
	//this method show the answer of question
	public  void showAnswer(){
		for(int i=0;i<5;i++){
			System.out.println("\n---------------Question."+(i+1)+"--------------");
			System.out.println(question[i]);
			System.out.println("Option");
			for(int j=0;j<4;j++){
				System.out.println(options[i][j]);
			}
			System.out.println("Correct Options is: "+ answer[i]);
		}
	}
	
	//this method generate the certificate 
	public void generateCertificate() {
		
	}
}
