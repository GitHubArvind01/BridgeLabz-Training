package com.OopsScenarioBased.foodloop;
import java.util.*;

public class ShopOwner {
	//shop owner can add food list, remove, and update food
	
	static List<FoodItem> foodList = new ArrayList<>();
	
	//add food
	public void addFood(FoodItem newFood) {
		foodList.add(newFood);
		System.out.println("food added.");
	}
	
	//remove food
	public void removeFood(FoodItem newFood) {
		if(foodList.contains(newFood)) {
			foodList.remove(newFood);
			System.out.println("Food removed.");
			return;
		}
		System.out.println("Food not found to remove!");
	}
	
	//view all food
	public void viewAllFood() {
		int i = 1;
		System.out.println("--------------------------------Food list---------------------------------");
		for(FoodItem item: foodList) {
			System.out.println("---------Food item "+(i)+"-----------------");
			System.out.println("Food Id: "+item.getFoodId());
			System.out.println("Food name: "+item.getName());
			System.out.println("Food price: "+item.getPrice());
			System.out.println("Food Category: "+item.getCategory());		
			System.out.println("Availablity: "+item.isAvailability());
			System.out.println("---------------------------------");
			i+=1;
		}
		System.out.println("--------------------------------------------------------------------------");
	}
	
	//update food status
	public void updateStatus(int foodId, boolean update) {
		for(FoodItem item : foodList) {
			if(item.getFoodId()==foodId) {
				item.setAvailability(update);
				System.out.println("Fodd status updated!");
				break;
			}
		}
		System.out.println("Food id not found!");
	}
}
