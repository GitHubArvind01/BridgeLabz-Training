package com.keywords;

public class Product {
	// Static variable shared by all products
	   private static double discount = 0.0;
	   // Instance variables
	   private final String productID; // Final variable to ensure the unique identifier cannot be changed
	   private String productName;
	   private double price;
	   private int quantity;
	   
	   public Product(String productID, String productName, double price, int quantity) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	   }
	   
	   // Static method to update the discount percentage
	   public static void updateDiscount(double newDiscount) {
	       if (newDiscount >= 0.0 && newDiscount <= 100.0) {
	           discount = newDiscount;
	       } else {
	           System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
	       }
	   }
	   
	   // Method to calculate the price after applying the discount
	   public double getDiscountedPrice() {
	       return price - (price * discount / 100);
	   }

	   // Method to display product details
	   public void displayProductDetails() {
	       // Using 'instanceof' to verify the object's type before displaying details
	       if (this instanceof Product) {
	           System.out.println("Product ID: " + productID);
	           System.out.println("Product Name: " + productName);
	           System.out.println("Price: $" + price);
	           System.out.println("Quantity: " + quantity);
	           System.out.println("Discount: " + discount + "%");
	           System.out.println("Price after Discount: $" + getDiscountedPrice());
	       } else {
	           System.out.println("The object is not an instance of the Product class.");
	       }
	   }
	   
	   //getter and setter
	   public String getProductName() {
		   return productName;
	   }

	   public void setProductName(String productName) {
		   this.productName = productName;
	   }

	   public double getPrice() {
		   return price;
	   }

	   public void setPrice(double price) {
		   this.price = price;
	   }

	   public int getQuantity() {
		   return quantity;
	   }

	   public void setQuantity(int quantity) {
		   this.quantity = quantity;
	   }

	   public String getProductID() {
		   return productID;
	   }
	   public static void main(String[] args) {
		   
	       // Update the discount for all products
	       Product.updateDiscount(15.0); // 15% discount
	       
	       // Create new product instances
	       Product product1 = new Product("P0001", "Keyword", 1200.00, 5);
	       Product product2 = new Product("P0002", "Iphone", 8000.00, 10);
	       
	       // Display product details
	       product1.displayProductDetails();
	       
	       System.out.println();
	       product2.displayProductDetails();
	   }
}
