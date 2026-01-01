package com.Inheritance.SampleProblems.Order;

public class Order{
	//attributes
	String orderId;
	String orderDate;
	
	//constructor
	public Order(String orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	//
	public void getOrderStatus() {
		System.out.println("------------Delivery Status--------------");
		System.out.println("Order Placed!");
	}
}