package com.multithreading.samplepractice.example_creatingThreadClass;

public class Main {

	public static void main(String[] args) {
		PrintNumber n1 = new PrintNumber();
		n1.setName("Thread - 1");
		
		PrintNumber n2 = new PrintNumber();
		n2.setName("Thread - 2");
		
		n1.start();
		
		n2.start();
	}
}