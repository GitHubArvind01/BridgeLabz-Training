package com.OopsScenarioBased.foodloop;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//food item
		FoodItem item1 = new VegItem(101,"Puri Sabji","Veg Food",120,true);
		FoodItem item2 = new VegItem(102,"Chole Bature","Veg Food",80,true);
		FoodItem item3 = new NonVegItem(103,"Mutton Kari","Non Veg Food",720,true);
		FoodItem item4 = new VegItem(104,"Dal Chawal","Veg Food",100,true);
		FoodItem item5 = new NonVegItem(105,"Chicken Tikka","Non Veg Food",300,true);
		FoodItem item6 = new VegItem(106,"Pani Puri","Veg Food",50,true);
		
		//owner can add food , remove, and update status
		ShopOwner owner = new ShopOwner();
		owner.addFood(item1);
		owner.addFood(item2);
		owner.addFood(item3);
		owner.addFood(item4);
		owner.addFood(item5);
		owner.addFood(item6);
		
		//user create
		System.out.println();
		System.out.println("Enter your name: ");
		
		String name = sc.nextLine();
		System.out.println("Enter your amount: ");
		double balanceAmount = sc.nextDouble();
		User users = new User(name,balanceAmount);

		Order orders = new Order(users);
		
		//here work start
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("want view food menu-> enter 'M' : ");
			System.out.println("Want to order food-> enter 'F' : ");
			System.out.println("Want to cancel order-> enter 'c': ");
			System.out.println("View Bill-> enter 'V': ");
			System.out.println("View balance-> enter 'B': ");
			System.out.println("For exit quiz -> enter 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			sc.nextLine();
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'M':
					owner.viewAllFood();
					break;
				case 'F':
					System.out.println("Enter the food id: ");
					int orderId = sc.nextInt();
					orders.placeOrder(orderId);
					break;
				case 'V':					
					orders.viewBill();
					break;
				case 'C':
					System.out.println("Enter the food id: ");
					int cancelId = sc.nextInt();
					orders.cancelOrder(cancelId);
					break;
				case 'B':
					users.checkBalance();
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
