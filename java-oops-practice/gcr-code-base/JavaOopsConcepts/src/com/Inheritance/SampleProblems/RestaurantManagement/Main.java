package com.Inheritance.SampleProblems.RestaurantManagement;

public class Main {

	public static void main(String[] args) {
		Chef c = new Chef("Ram","332DKD");
		Waiter w = new Waiter("luta","DKD232");
		c.performDuties();
		w.performDuties();
	}
}
