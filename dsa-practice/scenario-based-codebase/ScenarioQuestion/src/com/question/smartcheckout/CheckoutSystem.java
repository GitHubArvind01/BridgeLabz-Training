package com.question.smartcheckout;
import java.util.*;

public class CheckoutSystem {
	static HashMap<Integer,Item> itemMap = new HashMap<>();
	
	//view item
	public void viewItem() {
		int i=1;
		System.out.println("-----------------------------------------Item List----------------------------------------");
		if(Item.itemList.isEmpty()) {
			System.out.println("Item list is empty!");
			System.out.println("-------------------------------------------------------------------------------------------");
			return;
		}
		for(Item item : Item.itemList) {
			System.out.println("-----------Item No. "+(i)+"----------");
			System.out.println("Item Id: "+item.itemId);
			System.out.println("Item Name: "+item.itemName);
			System.out.println("Item Price: "+item.price);
			System.out.println("Item Quantity: "+item.quantity);
			System.out.println("----------------------------");
			i+=1;
		}
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	
	//checkout
	public void checkout() {
		if(Item.itemList.isEmpty()) {
			System.out.println("Please add item for checkout!");
			return;
		}
		System.out.println("-----------------------Checkout Details-----------------------");
		if(Customer.customerList.isEmpty()) {
			System.out.println("Customer List empty!");
			return;
		}
		Customer firstCustomer = Customer.customerList.poll();
		double totalAmount = 0.0;
		for(Item item : Item.itemList) {
			totalAmount+= (item.quantity)*item.price;
		}
		System.out.println("Customer Name: "+firstCustomer.name);
		System.out.println("Total Bill Amount: "+(totalAmount));
		System.out.println("--------------------------------------------------------------");
		//at last we clear the list of item in  list
		Item.itemList.clear();
	}
	
	//is customer exist
	public boolean isCustomer() {
		if(Customer.customerList.isEmpty()) {
			System.out.println("Please create customer first!");
			return false;
		}
		return true;
	}
}
