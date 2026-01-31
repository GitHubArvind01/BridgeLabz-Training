package com.functionalInterfaces.backgroundjobexecution;

public class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running using runnable interface");
	}
}