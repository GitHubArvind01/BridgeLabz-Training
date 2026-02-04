package com.multithreading.samplepractice.creating_runnable_interface;

public class Main {

	public static void main(String[] args) {
		MyRunnable m = new MyRunnable();
		
		Thread thread1 = new Thread(m);
		thread1.setName("Thread one : ");
		thread1.start();
		
		Thread thread2 = new Thread(m);
		thread2.setName("Thread two : ");
		thread2.start();		
	}
}