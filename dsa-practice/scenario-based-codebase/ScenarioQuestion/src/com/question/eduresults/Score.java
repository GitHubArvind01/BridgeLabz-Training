package com.question.eduresults;

public class Score {
	static int count = 101;
	double score;
	int stuId;
	String name;
	
	public Score(String name, double score) {
		this.name = name;
		this.score = score;
		this.stuId = count++;
	}
}
