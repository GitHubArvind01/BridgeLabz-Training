package com.tree.ecommerceinventory;

public class Main {

	public static void main(String[] args) {
		InventoryManagement m = new InventoryManagement();
		m.addProduct("Shirts", "SKDX1233", 1200);
		m.addProduct("Amul Milk", "JCDKSW21", 68);
		m.viewAllProducts();
		
		m.updatePrice("SKDX1233", 100);
		m.viewAllProducts();
	}
}