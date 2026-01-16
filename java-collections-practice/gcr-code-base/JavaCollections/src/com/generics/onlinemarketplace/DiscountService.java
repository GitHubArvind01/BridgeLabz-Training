package com.generics.onlinemarketplace;

public class DiscountService {
	public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.price * (percentage / 100);
        product.setPrice(product.price - discount);

        System.out.println("Discount applied to " + product.name);
        System.out.println("New Price: " + product.price);
    }
}
