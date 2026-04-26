package com.OopsScenarioBased.edumentor;
import java.util.*;

public class Quiz implements ICertifiable{
	
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
	
	static Map<Integer, StudentResult> quizStudentData = new HashMap<>();
	
	public void showQuestion(int id) {
		boolean found = false;
		for(Student st:Instructor.students) {
			if(st.getUserId()==id) {
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student id not found!");
			return;
		}
		
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
		validateOuput(id);
	}
	
	//this method validate the option
	public void validateOuput(int id){
		int correct = 0;
		int incorrect = 0;
		for(int i=0;i<5;i++){
			if(answer[i]==userAnswer[i]){
				correct+=1;
			}else{
				incorrect+=1;
			}
		}
		//here we store the each student data in map -> before we create the object of studentResult then put in map
		StudentResult std = new StudentResult(id,correct,incorrect);
		quizStudentData.put(id, std);
		
		System.out.println("\n---------------Final Result--------------");
		System.out.println("Correct Questions: "+correct);
		System.out.println("Incorrect Questions: "+incorrect);
	}
	
	//this method so the progress of each student by their id
	public void showProgress(int id) {
		for(var a : Quiz.quizStudentData.entrySet()) {
			if(a.getKey()==id) {
				//print data of that student
				System.out.println("------------------Student Result------------------");
				System.out.println("Student Id: "+a.getValue().getStudentId());
				System.out.println("Correct: "+a.getValue().getCorrect());
				System.out.println("Incorrect Id: "+a.getValue().getIncorrect());
				System.out.println("--------------------------------------------------");
				return;
			}
		}
		System.out.println("Student not found with id: "+id);
	}
	
	@Override
	public void generateCertificate(int id) {

	    StudentResult result = quizStudentData.get(id);

	    if (result == null) {
	        System.out.println("No quiz attempt found!");
	        return;
	    }

	    if (result.getCorrect() >= 3) {
	        System.out.println("\n🎉 CERTIFICATE OF COMPLETION 🎉");
	        System.out.println("Student ID: " + id);
	        System.out.println("Score: " + result.getCorrect() + "/5");
	        System.out.println("Status: PASSED");
	    } else {
	        System.out.println("Sorry! Not eligible for certificate.");
	    }
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
}
