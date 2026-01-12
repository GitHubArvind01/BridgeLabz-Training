package com.question.callcenter;

public class Main {

	public static void main(String[] args) {
		Mangement m = new Mangement();
		m.callRequest(new Customer("Allu","76520594634"));
		m.callRequest(new Customer("ravi","77520594666"));
		m.callRequest(new Customer("kali","84520594612"));
		m.callRequest(new Customer("suriya","95520334634"));
		m.callRequest(new Customer("Allu","76520594634"));
		m.callRequest(new Customer("Allu","76520594634"));
		m.callRequest(new Customer("amit","73520594634"));
		m.callRequest(new Customer("amit","73520594634"));
		m.callRequest(new Customer("amit","73520594634"));
		
		m.callbackCustomer();
		
		m.viewHistory();
	}
}
