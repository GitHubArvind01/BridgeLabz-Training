package com.OopsScenarioBased.fittrack;

public class Workout {
	private char type;
	private double duration;
	private double caloriesBurned;
	
	public Workout(char type, double duration, double caloriesBurned) {
		this.type = type;
		this.duration = duration;
		this.caloriesBurned = caloriesBurned;
	}
	public char getType() {
		return type;
	}
	public double getDuration() {
		return duration;
	}
	public double getCaloriesBurned() {
		return caloriesBurned;
	}
}
