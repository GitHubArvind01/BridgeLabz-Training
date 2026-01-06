package com.OopsScenarioBased.SwiftCart;
import java.util.*;

public class Cart implements ICheckout{
	private ArrayList<Product> cartProducts = new ArrayList<>();
	
	//imp-
	//we need product object to store in the cart class -> because we have create product list to store it
	
	
	//this method add product in the cart
	public void addCart(int productId) {
		for(Product p:Shop.products) {
			if(p.getProdcutID()==productId) {
				cartProducts.add(p);
				System.out.println("\n"+p.getName()+" added in the cart..");
				return;
			}
		}
		System.out.println("\nInvalid! Please enter valid product id.");
	}
	
	//this method remove product in to the cart
	public void removeCart(int productId) {
		for(Product p:cartProducts) {
			if(p.getProdcutID()==productId) {
				cartProducts.remove(p);
				System.out.println("\n"+p.getName()+" removed in the cart..");
				return;
			}
		}
		System.out.println("\nInvalid! Please enter valid product id.");
	}
	
	//view cart product
	public void viewCartProducts() {
		if(cartProducts.isEmpty()) {
			System.out.println("Sorry! Now cart is empty!");
			return;
		}
		int i = 0;
		System.out.println("--------------------------------Cart List Products----------------------------------");
		for(Product p:cartProducts) {
			System.out.println("-----------Product "+(i+1)+"---------------");
			System.out.println("Product Name: "+p.getName());
			System.out.println("Product Price: "+p.getPrice());
			System.out.println("Product Category: "+p.getCategory());
			System.out.println("Product Id: "+p.getProdcutID());
			System.out.println("-----------------------------------");
			System.out.println();
			i+=1;
		}
		System.out.println("-------------------------------------------------------------------------------------");
	}

	@Override
	public void generateBill() {
		System.out.println("\n--------------------------------Product Bill----------------------------------");
		if(cartProducts.isEmpty()) {
			System.out.println("Sorry! cart is empty!");
			System.out.println("Total Price: 0$");
			System.out.println("------------------------------------------------------------------------------");
			return;
		}
		double totalPrice = 0.0;
		for(Product p:cartProducts) {
			totalPrice+=p.getPrice();
		}
		System.out.println("Bill Amount: "+totalPrice+"$");
		double discountAmount = applyDiscount(totalPrice);
		System.out.println("Disount amount is: "+discountAmount+"$");
		System.out.println("Toatal Price: "+(totalPrice-discountAmount));
		System.out.println("------------------------------------------------------------------------------");
	}

	public double applyDiscount(double price) {
		if(price<=100) {
			return price;
		}
		else if(price>100 && price<500) {
			return price*0.02;
		}
		else if(price>500 && price<100) {
			return price*0.03;
		}
		else if(price>1000 && price<5000) {
			return price*0.05;
		}
		else if(price>5000 && price<10000) {
			return price*0.08;
		}
		else if(price>10000 && price<20000) {
			return price*0.10;
		}
		else if(price>20000 && price<50000) {
			return price*0.12;
		}
		else if(price>50000 && price<100000) {
			return price*0.05;
		}
		else{
			return price*0.20;
		}
		
	}
}
