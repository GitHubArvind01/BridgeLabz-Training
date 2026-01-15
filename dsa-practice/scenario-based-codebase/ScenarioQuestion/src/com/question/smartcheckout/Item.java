package com.question.smartcheckout;
import java.util.*;

public class Item {
	static int counter = 1001;
	
	static Map<Integer,ArrayList<Item>> customerItemList = new HashMap<>();
	static List<Item> itemList = new ArrayList<>();
	
	String itemName;
	int itemId;
	double price;
	int quantity;
	
	public Item(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.itemId = counter++;
	}
	
	//add item
	public void addItem(Item item) {
		if(Customer.customerList.isEmpty()) {
			System.out.println("Please create customer first!");
			return;
		}
		itemList.add(item);
	}
	
	//hit checkout
}
