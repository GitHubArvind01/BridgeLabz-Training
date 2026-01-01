package com.Inheritance.SampleProblems.Order;

public class DeliveredOrder extends ShippedOrder{
	//attributes
	String deliveryDate;
	//constructor
	public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	//method getOrderStatus
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Order Delivered Successfull on "+deliveryDate);
		System.out.println("----------------------------------------");
	}
	
}
