package com.classandobject.Level1;

public class PrintCircle {
	//non-static variables
		double radius;
		
		//constructors
		PrintCircle(double radius){
			this.radius=radius;
		}
		
		//Creating method for calculating area of circle
		public void areaCircle() {
			System.out.printf("Area of circle: %.4f",(Math.PI*radius*radius));
		}
		
		//Creating method for calculating circumference of circle
		public void circumferenceCircle() {
			System.out.printf("\nCircumference of circle: %.4f ",(2*Math.PI*radius));
		}
}
