package com.question.tailorshop;
import java.time.*;

public class Order {
	static int count = 1001;
	String productName;
	int orderId;
	LocalDate data;
	
	public Order(String productName, LocalDate data) {
		this.productName = productName;
		this.orderId = count++;
		this.data = data;
	}
}
