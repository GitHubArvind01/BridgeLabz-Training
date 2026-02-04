package com.multithreading.samplepractice.example_creatingThreadClass;

public class PrintNumber extends Thread{
	public void run() {
		int n = 5;
		for(int i=1;i<=n;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+ i);
			try {
				sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
