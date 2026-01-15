package com.smartwarehouse;

public class Main {

	public static void main(String[] args) {
		WarehouseItem mouse = new Electronics("Mouse",599,2);
		WarehouseItem chair = new Furniture("Char",1299,7);
		WarehouseItem rice = new Groceries("Rice",300,5);
		
		
		Storage<WarehouseItem> store = new Storage<>();
		store.addItem(rice);
		store.addItem(chair);
		store.addItem(mouse);
		
		store.showItem(store.getItemList());
	}
}
