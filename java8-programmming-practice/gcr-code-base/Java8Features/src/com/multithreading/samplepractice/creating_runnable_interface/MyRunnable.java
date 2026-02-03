package com.multithreading.samplepractice.creating_runnable_interface;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName()+" completed.");
	}

}
