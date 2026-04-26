package com.objectmodeling.AssistedProblems.ecommerce;
import java.util.*;

public class Customer {
	private String name;
	
	ArrayList<Order> orders = new ArrayList<>(); // -> here it will show the list of order by one customer
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void placeOrder(Order order) {
		orders.add(order);
		System.out.println("--------------------------------------------");
		System.out.println(name + " your order placed-> Order id is: " + order.getOrderId());
		System.out.println("--------------------------------------------");
	}
	
	public List<Order> getOrders(){
		return orders;
	}
	
	public void viewOrders() {
		for(Order ord:orders) {
			System.out.println("\n----------------Total order------------------");
			System.out.println("Order id: "+ord.getOrderId());
		}
		System.out.println("--------------------------------------------");
	}
}
