package com.onlinemarketplace;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("Java Mastery", 500, BookCategory.EDUCATION);
        Clothing shirt = new Clothing("T-Shirt", 999, ClothingCategory.MEN);
        Gadget phone = new Gadget("Smartphone", 20000, GadgetCategory.MOBILE);

        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        DiscountService.applyDiscount(book, 10);
        DiscountService.applyDiscount(shirt, 20);
        DiscountService.applyDiscount(phone, 5);
	}
}
