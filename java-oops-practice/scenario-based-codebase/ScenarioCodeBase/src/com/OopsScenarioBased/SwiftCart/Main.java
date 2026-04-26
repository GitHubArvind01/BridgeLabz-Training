package com.OopsScenarioBased.SwiftCart;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//we create the object of product class
		Product mouse = new Product("Mouse",120,"Electronics",101);
		Product iphone = new Product("Iphone",880,"Electronics",102);
		Product laptop = new Product("Laptop",1500,"Electronics",103);
		Product shirt = new Product("Shirts",8,"Clothes",104);
		Product bottle = new Product("Bottle",10,"Normal",105);
		Product TV = new Product("TV",500,"Electronics",106);
		
		//shop owner add this product in product list
		Shop shopOwner = new Shop();
		shopOwner.addProduct(mouse);
		shopOwner.addProduct(TV);
		shopOwner.addProduct(bottle);
		shopOwner.addProduct(shirt);
		shopOwner.addProduct(laptop);
		shopOwner.addProduct(iphone);
	
	    Customer cus = new Customer(new Cart());
	    
		while(true) {
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("Want to See Product list-> please enter 'P': ");
			System.out.println("Add Product in Cart-> please enter 'A' : ");
			System.out.println("Remove Product in Cart-> please enter 'R' : ");
			System.out.println("Want to View Cart list-> press 'V' :");
			System.out.println("Want to Check Bill-> press 'B' ");
			System.out.println("Want to Exit-> press 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c) {
				case 'P': //done
					shopOwner.viewProducts();
					break;
				case 'A':
					//take input - 
					System.out.println("Please Enter the Product Id-> For Add in cart: ");
					int addID = sc.nextInt();
				    cus.addCarts(addID);
					break;
				case 'R':
					//take input - 
					System.out.println("Please Enter the Product Id-> For Removed in cart: ");
					int removeID = sc.nextInt();
					cus.removeCarts(removeID);
					break;
				case 'V':
					cus.viewCarts();
					break;
				case 'B':
					cus.generateBills();
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
