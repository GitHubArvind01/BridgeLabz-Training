package com.generics.mealplangenerator;

public class KetoMeal implements MealPlan{
	private String mealName;
    private int calories;
    
	public KetoMeal(String mealName, int calories) {
		this.mealName = mealName;
		this.calories = calories;
	}

	@Override
	public String getMealName() {
		return mealName;
	}

	@Override
	public int getCalories() {
		return calories;
	}

	@Override
	public String getCategory() {
		return "Vegetarian Meal";
	}

	@Override
	public void displayMeal() {
		System.out.println(mealName+" | "+calories+" kcal | "+"Keto meal.\n");
	}
}
