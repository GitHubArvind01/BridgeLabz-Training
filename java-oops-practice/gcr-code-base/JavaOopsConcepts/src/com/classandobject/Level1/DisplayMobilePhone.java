package com.classandobject.Level1;

public class DisplayMobilePhone {
	String brand;
	String model;
	double price;
	
	DisplayMobilePhone(String b, String m, double p){
		this.brand = b;
		this.model = m;
		this.price = p;
	}
	
	public void displayMobile() {
		System.out.println("Brand of mobile: "+brand);
		System.out.println("Model of mobile: "+model);
		System.out.println("Price of mobile: "+price);
		System.out.println("------------------------------");
	}
}
