package com.smartwarehouse;

public abstract class WarehouseItem {
	String itemName;
	double price;
	int quantity;
	
	public WarehouseItem(String itemName, double price, int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
}
