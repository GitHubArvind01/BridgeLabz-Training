package com.generics.resumescreenin;

public class DataScientist extends JobRole{
	private int mlScore;
	
	public DataScientist(String candidateName, int mlScore) {
		super(candidateName);
		this.mlScore = mlScore;
	}

	@Override
	String getRoleName() {
		return "Data Scientist";
	}

	@Override
	boolean screenResume() {
		return mlScore>=60;
	}
}
