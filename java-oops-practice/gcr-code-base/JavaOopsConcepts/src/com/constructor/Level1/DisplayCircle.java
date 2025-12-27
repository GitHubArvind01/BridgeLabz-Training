package com.constructor.Level1;

public class DisplayCircle {
	double radius;
	
	//constructor
	DisplayCircle(double radius){
		this.radius = radius;
	}
	
	//calculate radius and print
	public void displayResult() {
		System.out.println("Area of circle: " + Math.PI*radius*radius);
	}
}
