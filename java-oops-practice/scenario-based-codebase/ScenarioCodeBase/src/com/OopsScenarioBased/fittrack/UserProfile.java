package com.OopsScenarioBased.fittrack;

public class UserProfile {
	 private String name;
	 private int age;
	 private double weight;
	 private double dailyGoal;
	 private int userID;;
	 
	 public UserProfile(String name, int age, double weight, double dailyGoal, int userID) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dailyGoal = dailyGoal;
		this.userID = userID;
	 }

	 public String getName() {
		 return name;
	 }

	 public int getAge() {
		 return age;
	 }

	 public double getWeight() {
		 return weight;
	 }

	 public double getDailyGoal() {
		 return dailyGoal;
	 }
	 
	 public int getUserID() {
		 return userID;
	 }
}
