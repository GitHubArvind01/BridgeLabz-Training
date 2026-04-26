package com.question.parceltracker;

public class Delivery {
	String status;
	Delivery next;
	
	public Delivery(String status) {
		this.status = status;
		this.next = null;
	}
}
