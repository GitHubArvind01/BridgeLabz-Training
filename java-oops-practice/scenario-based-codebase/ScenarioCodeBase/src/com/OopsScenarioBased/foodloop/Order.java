package com.OopsScenarioBased.foodloop;
import java.util.*;

public class Order implements IOrderable{
	User users;
	
	Order(User users){
		this.users = users;
	}
	//list of order 
	static List<FoodItem> orderfoodList = new ArrayList<>();
	
	//food place 
	public void placeOrder(int foodId) {
		for(FoodItem item: ShopOwner.foodList) {
			if(item.getFoodId()==foodId) {
				if(item.getPrice()<=users.getWalletBalance()) {
					users.setWalletBalance((users.getWalletBalance()-item.getPrice())); //user wallet get deduct by price of food they ordered 
					System.out.println("\nFood ordered success.");
					orderfoodList.add(item); //here add order food for that user
					item.setAvailability(false); //here we update the food false it ordered once
					return;
				}else {
					System.out.println("Sorry! balance not sufficient to order food!");
					return;
				}
			}
		}
		System.out.println("food item not found!");
	}
	
	//public void cancel order
	public void cancelOrder(int foodId) {
		for(FoodItem item:orderfoodList) {
			if(item.getFoodId()==foodId) {
				users.setWalletBalance((users.getWalletBalance()+item.getPrice()));
				System.out.println("\nFood cancel success.");
				return;
			}
		}
		System.out.println("Food not found!");
	}
	
	//view balance
	public void viewBill() {
		int j=1;
		System.out.println("\n----------Food Bill Amount------------");
		double totalBill = 0.0;
		for(FoodItem item:orderfoodList) {
			System.out.println("Food item "+j+"------");
			System.out.println("Food name:"+item.getName());
			System.out.println("Food Price: "+item.getPrice());
			
			totalBill+=item.getPrice();
			System.out.println("-----------------");
			j+=1;
		}
		System.out.println("Total Price----> : "+totalBill);
		System.out.println("----------------------------------------");
	}
}
