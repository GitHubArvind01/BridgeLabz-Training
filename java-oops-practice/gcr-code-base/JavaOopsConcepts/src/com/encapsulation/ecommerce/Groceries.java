package com.encapsulation.ecommerce;

public class Groceries extends Product implements Taxable{
	static double discount = 0.1;
	public Groceries(double productId, String name, double price) {
		super(productId, name, price);
	}

	 @Override
    double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% tax
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 12%";
    }
}
