package com.OopsScenarioBased.fittrack;

public class CardioWorkout extends Workout implements ITrackable{

	public CardioWorkout(char type, double duration, double caloriesBurned) {
		super(type, duration, caloriesBurned);
	}

	@Override
	public void startWorkout() {
		System.out.println("Cardio Workout started--");	
	}

	@Override
	public void stopWorkout() {
		System.out.println("Cardio Workout end--");
	}
	
	// Operators to compute calorie targets and progress (dailyTarget - caloriesBurned)
}
