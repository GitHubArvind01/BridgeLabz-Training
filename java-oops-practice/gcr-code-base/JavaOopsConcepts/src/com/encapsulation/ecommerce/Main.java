package com.encapsulation.ecommerce;

public class Main {

    static void printFinalPrice(Product product) {
        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }

        double discount = product.calculateDiscount();
        double finalPrice = product.getPrice() + tax - discount;

        System.out.println("Product: " + product.getName());
        System.out.println("Base Price: " + product.getPrice());
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("----------------------------------");
    }

	public static void main(String[] args) {
		 Product p1 = new Electronics(101, "Laptop", 60000);
	     Product p2 = new Clothing(102, "Jacket", 3000);
	     Product p3 = new Groceries(103, "Rice Bag", 1200);
	     
	     printFinalPrice(p1);
	     printFinalPrice(p2);
	     printFinalPrice(p3);
	}
}
