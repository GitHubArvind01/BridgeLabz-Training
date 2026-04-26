package com.multithreading.samplepractice.thread_constructor_parameters;

public class PrintNumberThread extends Thread{
	String name;
	int count;
	
	public PrintNumberThread(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=count;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
