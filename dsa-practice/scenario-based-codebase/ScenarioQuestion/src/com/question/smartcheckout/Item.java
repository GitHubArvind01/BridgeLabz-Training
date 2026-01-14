package com.question.smartcheckout;

public class Item {
	String itemName;
	int itemId;
	double price;
	int quantity;
	
	public Item(String itemName, double price, int quantity,int itemId) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.itemId = itemId;
	}
}
