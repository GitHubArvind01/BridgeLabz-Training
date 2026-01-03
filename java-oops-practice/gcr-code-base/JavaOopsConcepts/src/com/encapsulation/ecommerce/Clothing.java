package com.encapsulation.ecommerce;

public class Clothing extends Product{
	static double discount = 0.05;
	public Clothing(double productId, String name, double price) {
		super(productId, name, price);
	}
	

	 @Override
    double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}
