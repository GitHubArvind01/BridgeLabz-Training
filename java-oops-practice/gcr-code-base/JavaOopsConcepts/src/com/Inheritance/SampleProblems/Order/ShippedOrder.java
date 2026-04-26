package com.Inheritance.SampleProblems.Order;

public class ShippedOrder extends Order{
	//attributes
	String trackingNumber;
	//constructor

	public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	//method
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Orde Shipped-> Tracking Number: "+trackingNumber);
	}
}
