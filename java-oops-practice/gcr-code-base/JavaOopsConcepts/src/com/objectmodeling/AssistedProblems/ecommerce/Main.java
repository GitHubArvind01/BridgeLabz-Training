package com.objectmodeling.AssistedProblems.ecommerce;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer("ramu");
		
		Product p1 = new Product(101,"keyword",1200);
		Product p2 = new Product(102,"digitalPen",1500);

        Order o1 = new Order(201);
        o1.addProduct(p1);
        o1.addProduct(p2);

        c.placeOrder(o1);
        
        o1.viewProducts();//-> it will show the all product
        
        Customer c2 = new Customer("Allu");
		
		Product p3 = new Product(103,"Mac-1",120000);
		Product p4 = new Product(104,"Iphone",150000);

        Order o2 = new Order(202);
        o2.addProduct(p3);
        o2.addProduct(p4);
        
        c2.placeOrder(o2);
        Order o3 = new Order(203);
        o3.addProduct(p4);
        
        o2.viewProducts();//-> it will show the all product
        
        
        c2.viewOrders(); // -> it will show the all orders
	}
}
