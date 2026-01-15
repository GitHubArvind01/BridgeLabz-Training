package com.question.smartcheckout;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		CheckoutSystem system = new CheckoutSystem();

		//here work start
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("Create New Customer-> please enter 'C' : ");
			System.out.println("Added Item-> please enter 'A' : ");
			System.out.println("View Item-> enter 'V': ");
			System.out.println("Checkout-> enter 'O': ");
			System.out.println("For exit -> enter 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			sc.nextLine();
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'C':
					System.out.println("Enter your name: ");
					String cusName = sc.nextLine();
					Customer newCus = new Customer(cusName);
					newCus.addCustomer(newCus);
					break;
				case 'A':
					if(!system.isCustomer()) {
						break;
					}
					System.out.println("Enter Item name: ");
					String itemName = sc.nextLine();
					
					System.out.println("Enter price: ");
					double itemPrice = sc.nextDouble();
					
					System.out.println("Enter quantity: ");
					int quantity = sc.nextInt();
					
					Item item = new Item(itemName,itemPrice,quantity);
					item.addItem(item);
					break;
				case 'V':
					system.viewItem();
					break;
				case 'O':
					system.checkout();
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
