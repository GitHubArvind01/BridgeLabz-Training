package com.encapsulation.ecommerce;

abstract class Product {
	private double productId;
	private String name;
	private double price;
	
	public Product(double productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	abstract double calculateDiscount();
	
	public double getProductId() {
		return productId;
	}
	public void setProductId(double productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	
}
