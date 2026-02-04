package com.multithreading.samplepractice.datalossfix;

public class Implent {
    public static void main(String[] args) {
    	PrintData m = new PrintData();
    	
		Thread t1 = new Thread(()-> {
			m.print();
		});
	
		Thread t2 = new Thread (()->{
			m.print();	
		});
		t1.start();
		t2.start();
	}
}
