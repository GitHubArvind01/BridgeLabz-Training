package com.constructor.Level1;

public class DisplayProduct {
	private String productName;
	private double price;
	static int count;
	//constructor
	DisplayProduct(String product, double price){
		this.productName = product;
		this.price = price;
		count+=1;
	}
	

	//display the product details
	public void displayProductDetails() {
		System.out.println("Product Name: "+productName);
		System.out.println("Price : " + price);
		System.out.println("-------------------------");
	}
	
	//count total product
	public void displayTotalProducts() {
		System.out.println("Total Product : "+count);
	}
	
}
