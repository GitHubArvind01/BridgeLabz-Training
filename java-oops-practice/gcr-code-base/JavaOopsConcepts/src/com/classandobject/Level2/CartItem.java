package com.classandobject.Level2;

public class CartItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  DisplayCartItem item1 = new DisplayCartItem("Laptop", 999.99, 1);
		  
	       item1.displayItem();  // Display the initial item details
	       
	       // Adding and removing items
	       item1.addItem(2);      // Adding 2 more laptops
	       item1.removeItem(1);   // Removing 1 Laptop
	       
	       // Display total cost
	       System.out.println("Total cost: $" + item1.totalPrice());
	}
}
