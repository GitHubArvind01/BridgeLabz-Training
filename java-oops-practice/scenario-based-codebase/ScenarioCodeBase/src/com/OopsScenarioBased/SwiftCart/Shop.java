package com.OopsScenarioBased.SwiftCart;
import java.util.*;

public class Shop {
	static ArrayList<Product> products = new ArrayList<>();
	
	//add product
	public void addProduct(Product newProduct) {
		products.add(newProduct);
	}
	
	//view product
	public void viewProducts() {
		if(products.isEmpty()) {
			System.out.println("Sorry! Product list is empty!");
			return;
		}
		int i = 0;
		System.out.println("--------------------------------Products List----------------------------------------");
		for(Product p:products) {
			System.out.println("-----------Product "+(i+1)+"---------------");
			System.out.println("Product Name: "+p.getName());
			System.out.println("Product Price: "+p.getPrice());
			System.out.println("Product Category: "+p.getCategory());
			System.out.println("Product Id: "+p.getProdcutID());
			System.out.println("-----------------------------------");
			System.out.println();
			i+=1;
		}
		System.out.println("-------------------------------------------------------------------------------------");
	}
}