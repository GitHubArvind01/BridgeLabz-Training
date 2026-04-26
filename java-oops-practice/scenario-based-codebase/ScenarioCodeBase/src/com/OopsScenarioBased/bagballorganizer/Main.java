package com.OopsScenarioBased.bagballorganizer;

public class Main {

	public static void main(String[] args) {
		Bag bag = new Bag("Red",20);
		
		Ball b1 = new Ball("Yellow","Medium");
		Ball b2 = new Ball("Red","Small");
		Ball b3 = new Ball("Pink","Large");
		
		Management m = new Management();
		m.addBags(bag);
		
		m.addBalls(b1, 101);
		m.addBalls(b2, 101);
		m.addBalls(b3, 101);
		
		
		m.displayAllBalls();
		
		m.removeBalls(101);
	}
}

/* 
 * Add balls to a bag (up to capacity)
 * Remove a ball from a bag
 * Display all balls in a bag
 * Display all bags and their ball count
 * Prevent adding a ball if the bag is full
*/