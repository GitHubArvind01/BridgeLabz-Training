package com.OopsScenarioBased.fittrack;
import java.util.*;

public class GymOwner {
	//gym owner can add user 
	//gym owner can see all user progress
	//user can see their own progress
	static ArrayList<UserProfile> workoutUser = new ArrayList<>();
	
	static HashMap<Integer, StrengthWorkout> strengthUser = new HashMap<>();
	static HashMap<Integer, CardioWorkout> cardioUser = new HashMap<>();
	
	//add user strengthWorkoutUser
	public void addWorkoutUser(UserProfile user) {
		workoutUser.add(user);
	}
	
	//remove strength Work out user
	public void removeWorkoutUser(UserProfile user) {
		workoutUser.remove(user);
	}
	
	//validate the user id
	public boolean validateID(int id) {
		for(UserProfile user : workoutUser) {
			if(user.getUserID()==id) {
				return true;
			}
		}
		
		return false;
	}
	
	//add data of CardioUser member
	public void storedCardioUserCalories(int id, CardioWorkout cardio) {
		cardioUser.put(id,cardio);
	}
	//add data of StrengthUser member
	public void storedStrengthUserCalories(int id, StrengthWorkout strength) {
		strengthUser.put(id,strength);
	}
	
	//here calculate the calories
	public void checkProgess(int id) {
		//first find the dailyGoal in workoutUser
		double dailyGoal = 0.0;
		for(UserProfile user:workoutUser) {
			if(user.getUserID()==id) {
				dailyGoal = user.getDailyGoal();
			}
		}
		
		//second find the caloriesBurned
		double caloriesBurned = 0.0;
		for(var ct : strengthUser.entrySet()) {
			if(ct.getKey()==id) {
				System.out.println("--------------------Strength Progress Result-----------------");
				caloriesBurned = ct.getValue().getCaloriesBurned();
				System.out.println("Name: "+getNameUser(id));
				System.out.println("Daily Calorie Burn Goal : "+dailyGoal);
				System.out.println("Current Calories Burn: "+caloriesBurned);
				System.out.println("Result: "+(dailyGoal-caloriesBurned));
				System.out.println("------------------------------------------------------");
				return;
			}
		}
		
		for(var ct : cardioUser.entrySet()) {
			if(ct.getKey()==id) {
				System.out.println("--------------------Cardio Progress Result-----------------");
				caloriesBurned = ct.getValue().getCaloriesBurned();
				System.out.println("Name: "+getNameUser(id));
				System.out.println("Daily Calorie Burn Goal : "+dailyGoal);
				System.out.println("Current Calories Burn: "+caloriesBurned);
				System.out.println("Result: "+(dailyGoal-caloriesBurned));
				System.out.println("------------------------------------------------------");
				return;
			}
		}
	}
	
	//this method just return the name of id 
	public String getNameUser(int id) {
		for(UserProfile user: workoutUser) {
			if(user.getUserID()==id) {
				return user.getName();
			}
		}
		return "null";
	}
	
	//gym owner can see the user progress
	public void seeFullDetails() {
		//first find the dailyGoal in workoutUser
		double dailyGoal = 0.0;
		for(UserProfile user:workoutUser) {
			dailyGoal = user.getDailyGoal();
		}
		
		//second find the caloriesBurned
		double caloriesBurned = 0.0;
		for(var ct : strengthUser.entrySet()) {
			int id = ct.getKey();
			System.out.println("--------------------Strength Progress Result-----------------");
			caloriesBurned = ct.getValue().getCaloriesBurned();
			System.out.println("Name: "+getNameUser(id));
			System.out.println("Daily Calorie Burn Goal : "+dailyGoal);
			System.out.println("Current Calories Burn: "+caloriesBurned);
			System.out.println("Result: "+(dailyGoal-caloriesBurned));
			System.out.println("------------------------------------------------------");
		}
		
		for(var ct : cardioUser.entrySet()) {
			int id = ct.getKey();
			System.out.println("--------------------Cardio Progress Result-----------------");
			caloriesBurned = ct.getValue().getCaloriesBurned();
			System.out.println("Name: "+getNameUser(id));
			System.out.println("Daily Calorie Burn Goal : "+dailyGoal);
			System.out.println("Current Calories Burn: "+caloriesBurned);
			System.out.println("Result: "+(dailyGoal-caloriesBurned));
			System.out.println("------------------------------------------------------");
		}
	}
}
