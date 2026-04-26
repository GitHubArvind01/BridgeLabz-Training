package com.OopsScenarioBased.foodloop;

public class FoodItem {
	private int foodId;
	private String name;
	private String category;
	private double price;
	private boolean availability;
	
	public FoodItem(int foodId, String name, String category, double price, boolean availability) {
		this.foodId = foodId;
		this.name = name;
		this.category = category;
		this.price = price;
		this.availability = availability;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAvailability() {
		return availability;
	}
	
	public int getFoodId() {
		return foodId;
	}
	
	public void setAvailability(boolean update) {
		this.availability = update;
	}
}
