package com.objectmodeling.AssistedProblems.ecommerce;

public class Product {
	private double productId;
	private String productName;
	private double price;
	
	public Product(double productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	//getter
	public double getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}
}
