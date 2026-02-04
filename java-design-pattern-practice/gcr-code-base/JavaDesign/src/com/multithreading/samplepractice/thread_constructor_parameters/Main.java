package com.multithreading.samplepractice.thread_constructor_parameters;

public class Main {

	public static void main(String[] args) {
		PrintNumberThread p1 = new PrintNumberThread("Thread One",5);
		
		PrintNumberThread p2 = new PrintNumberThread("Thread Two",10);
		
		PrintNumberThread p3 = new PrintNumberThread("Thread Three",15);
		
		p1.start();
		p2.start();
		p3.start();
	}
}