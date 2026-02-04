package com.multithreading.samplepractice.datalossfix;

public class PrintData{
	static int count = 0;
	
	public synchronized  void print() {
		for(int i=0;i<10000;i++) {
			System.out.println(count);
			count+=1;
		}
	}
}


/*
 * public class PrintData{
	static int count = 0;
	
	public void print() {
		
		synchronized (this) {
			for(int i=0;i<10000;i++) {
				System.out.println(count);
				count+=1;
			}
		}
	}
}
 */