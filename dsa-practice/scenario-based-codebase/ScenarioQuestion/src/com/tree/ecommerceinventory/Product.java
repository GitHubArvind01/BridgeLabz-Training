package com.tree.ecommerceinventory;

public class Product {
	private String productName;
	private String skuNumber;
	private double price;
	
	Product left, right;

	public Product(String productName, String skuNumber, double price) {
		this.productName = productName;
		this.skuNumber = skuNumber;
		this.price = price;
		left = right = null;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSkuNumber() {
		return skuNumber;
	}

	public void setSkuNumber(String skuNumber) {
		this.skuNumber = skuNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getLeft() {
		return left;
	}

	public void setLeft(Product left) {
		this.left = left;
	}

	public Product getRight() {
		return right;
	}

	public void setRight(Product right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", skuNumber=" + skuNumber + ", price=" + price + "]";
	}
}