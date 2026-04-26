package com.OopsScenarioBased.fittrack;
import java.util.*;

public class StrengthWorkout extends Workout implements ITrackable{
	
	public StrengthWorkout(char type, double duration, double caloriesBurned) {
		super(type, duration, caloriesBurned);
	}
	
	@Override
	public void startWorkout() {
		System.out.println("Strength Workout started--");
	}

	@Override
	public void stopWorkout() {
		System.out.println("Strength Workout end--");
	}
	
	// Operators to compute calorie targets and progress (dailyTarget - caloriesBurned)
}
