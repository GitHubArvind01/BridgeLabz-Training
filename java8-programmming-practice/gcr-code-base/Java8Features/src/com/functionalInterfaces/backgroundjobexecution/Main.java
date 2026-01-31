package com.functionalInterfaces.backgroundjobexecution;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		
		Thread t = new Thread(task);
		
		t.start();
	}
}