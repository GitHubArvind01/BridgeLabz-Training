package com.questions.shopping_ecommerce;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> productList = List.of(
					new Product(101,"Shirt",220),
					new Product(102,"Bag",4043),
					new Product(103,"Bottle",332),
					new Product(104,"Car wheel",22504),
					new Product(105,"MAC-1",900000),
					new Product(106,"Hard Disk",7900),
					new Product(107,"Jense",900),
					new Product(108,"NoteBooks",2550),
					new Product(109,"Charger",543)
				);
		
		
		/*
		
			1.Use lambda to apply 10% discount on product price.
			
			2.Sort products by price using lambda.
			
			3.Use lambda to check free delivery eligibility (amount > 500).
			
			4.Use lambda to calculate final bill amount.
			
			5.Use lambda to print product names.
		 */
		//System.out.println("Before Discount Price is: "+x.getPrice()+ "--After 10% Discount Price: "+ (x.getPrice()-x.getPrice()*0.10)));
		
		System.out.println("1.Use lambda to apply 10% discount on product price.");
		productList.stream()
					.forEach(x-> {
						System.out.println("Before Discount Price is: "+x.getPrice());
						double discount = x.getPrice()-(x.getPrice()*0.10);
						x.setPrice(discount);
						System.out.println("After 10% Discount Price: "+x.getPrice());
					});
		
	}
}