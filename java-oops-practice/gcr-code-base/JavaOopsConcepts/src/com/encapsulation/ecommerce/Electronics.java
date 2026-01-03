package com.encapsulation.ecommerce;

public class Electronics extends Product implements Taxable{
	static double discount = 0.02;

	public Electronics(double productId, String name, double price) {
		super(productId, name, price);
	}

	 @Override
    double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}
