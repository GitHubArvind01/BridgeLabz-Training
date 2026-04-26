package com.question.traincompanion;

public class Train {
	String compartmentName;
	int compartmentNumber;
	Train next;
	Train prev;
	
	public Train(String compartmentName, int compartmentNumber) {
		this.compartmentName = compartmentName;
		this.compartmentNumber = compartmentNumber;
		this.next = null;
		this.prev = null;
	}
}
