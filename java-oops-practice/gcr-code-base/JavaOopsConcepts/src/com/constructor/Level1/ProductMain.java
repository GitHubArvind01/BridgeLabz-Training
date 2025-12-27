package com.constructor.Level1;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayProduct product1 = new DisplayProduct("milk",30);
		DisplayProduct product2 = new DisplayProduct("bread",90);
		DisplayProduct product3 = new DisplayProduct("sweet",130);
		DisplayProduct product4 = new DisplayProduct("georcy",300);
	
		product1.displayProductDetails();
		product2.displayProductDetails();
		product3.displayProductDetails();
		product4.displayProductDetails();
		
		product4.displayTotalProducts();;
	}
}
