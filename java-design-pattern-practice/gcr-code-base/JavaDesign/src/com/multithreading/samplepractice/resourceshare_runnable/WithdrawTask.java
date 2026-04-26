package com.multithreading.samplepractice.resourceshare_runnable;


public class WithdrawTask implements Runnable {

	int amount;
	BankAccount bankaccount;

	public WithdrawTask(int amount, BankAccount bankaccount) {
		this.amount = amount;
		this.bankaccount = bankaccount;
	}


	@Override
	public void run() {
		bankaccount.withdraw(amount);
	}
}
