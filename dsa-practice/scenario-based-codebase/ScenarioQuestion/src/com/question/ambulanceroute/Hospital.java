package com.question.ambulanceroute;

public class Hospital {
	String name;
	boolean availability;
	Hospital next;
	
	public Hospital(String name, boolean availability) {
		this.name = name;
		this.availability = availability;
		this.next = null;
	}
}
