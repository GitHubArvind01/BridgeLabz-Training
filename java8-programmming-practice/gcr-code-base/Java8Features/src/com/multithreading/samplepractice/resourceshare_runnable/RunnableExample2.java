package com.multithreading.samplepractice.resourceshare_runnable;

public class RunnableExample2 {
	public static void main(String args[]) {
		BankAccount account = new BankAccount();
		
		Thread t1 = new Thread(new WithdrawTask(600, account));
		t1.setName("Customer-1");

		Thread t2 = new Thread(new WithdrawTask(800, account));
		t2.setName("Customer-2");
				
		t1.start();
		t2.start();
	}
}
