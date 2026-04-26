package com.question.examproctor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question {
	static Scanner sc = new Scanner(System.in);
	
	static int correct = 0;
	static int incorrect = 0;
	
	static Map<Integer,String> questionsMap = new HashMap<>();
	static Map<Integer,String> answersMap = new HashMap<>();
	
	//here we add the question
	public void addQuestion(int questionId, String questions) {
		if(questionsMap.containsKey(questionId)) {
			System.out.println("Question is alreday exist!");
			return;
		}
		questionsMap.put(questionId, questions);
		System.out.println("Question added.");
	}
	
	//add answer
	public void addAnswer(int questionId, String answer) {
		if(answersMap.containsKey(questionId)) {
			System.out.println("Answer is alreday exist!");
			return;
		}
		answersMap.put(questionId, answer);
		System.out.println("Answer added.");
	}
	
	//view question
	public void viewQuestions() {
		for(var questions:questionsMap.entrySet()) {
			System.out.println("\nQuestion Id: "+questions.getKey());
			System.out.println("Question: "+questions.getValue());
		}
	}
	
	//solve question
	public void solveQuestions() {
		System.out.println("\n-------------------------------------------------------");
		for(var questions:questionsMap.entrySet()) {
			System.out.println("\nQuestion Id: "+questions.getKey());
			System.out.println("Question: "+questions.getValue());
			System.out.println("-----------------please give answer-------------------");
			String answer = sc.nextLine();
			if(answersMap.get(questions.getKey()).equalsIgnoreCase(answer)) {
				correct+=1;
			}else {
				incorrect+=1;
			}
		}
	}
	
	//validate answer
	public void validateAnswer() {
		System.out.println("---------------Result-----------------");
		System.out.println("Total Question - "+questionsMap.size());
		System.out.println("Correct Answer: "+correct);
		System.out.println("Incorrect Answer: "+incorrect);
		System.out.println("--------------------------------------");
	}
}
