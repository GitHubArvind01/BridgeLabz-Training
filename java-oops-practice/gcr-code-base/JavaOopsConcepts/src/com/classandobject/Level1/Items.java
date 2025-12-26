package com.classandobject.Level1;

public class Items {
	//declaring the variables for listing the items
		String[] itemCode;
		String[] itemName;
		double[] price;
		
		//constructor
		Items(String[]itemName ,String[] itemCode,double[] price){
			this.itemCode = itemCode;
			this.itemName = itemName;
			this.price = price;
		}
		
		public void displayItems(int i) {
			System.out.println("itemCode : "+itemCode[i]);
			System.out.println("itemPrice : "+price[i]);
			System.out.println("itemName : "+itemName[i]);
			System.out.println("----------------------------");
		}
}
