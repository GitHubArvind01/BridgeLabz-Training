package com.question.examproctor;

public class Main {

	public static void main(String[] args) {
		Question q = new Question();
		q.addQuestion(101, "Prime minster of india?");
		q.addQuestion(102, "What the Full Form of INR?");
		q.addQuestion(103, "Full Form of RAM?");
		
		
		q.addAnswer(101, "Narendra Modi");
		q.addAnswer(102, "Indian Rupess");
		q.addAnswer(103, "Read Only memory");
		
		q.viewQuestions();
		
		q.solveQuestions();
		
		q.validateAnswer();
	}
}