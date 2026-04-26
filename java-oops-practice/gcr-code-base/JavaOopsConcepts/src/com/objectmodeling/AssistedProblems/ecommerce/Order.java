package com.objectmodeling.AssistedProblems.ecommerce;

import java.util.*;

public class Order {
	
	private double orderId;
	private List<Product> products; // -> here list of product stored
	
	public Order(double orderId) {
		this.orderId = orderId;
		this.products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public List<Product> getProducts(){
		return products;
	}
	public double getOrderId() {
		return orderId;
	}
	public void viewProducts() {
		for(Product p:products) {
			System.out.println("\n----------------Product Details------------------");
			System.out.println("Product Name: "+p.getProductName());
			System.out.println("Product Id: "+p.getProductId());
			System.out.println("Price: "+p.getPrice());
			System.out.println("--------------------------------------------------");
		}
	}
}
