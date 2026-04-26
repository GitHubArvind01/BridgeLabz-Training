package com.OopsScenarioBased.SwiftCart;

public class Product {
	private String name;
	private int prodcutID;
	private double price;
	private String category;
	
	
	public Product(String name, double price, String category, int prodcutID) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.prodcutID = prodcutID;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}
	
	public int getProdcutID() {
		return prodcutID;
	}
}
