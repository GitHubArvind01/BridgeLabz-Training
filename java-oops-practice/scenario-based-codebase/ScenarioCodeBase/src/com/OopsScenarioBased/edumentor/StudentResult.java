package com.OopsScenarioBased.edumentor;

public class StudentResult{
	private int studentId;
	private int correct;
	private int incorrect;
	
	public StudentResult(int studentId, int correct, int incorrect) {		
		this.studentId = studentId;
		this.correct = correct;
		this.incorrect = incorrect;
	}

	public int getStudentId() {
		return studentId;
	}

	public int getCorrect() {
		return correct;
	}

	public int getIncorrect() {
		return incorrect;
	}
	
	@Override
    public String toString() {
        return "Student ID: " + studentId +
               " | Correct: " + correct +
               " | Incorrect: " + incorrect;
    }
}
