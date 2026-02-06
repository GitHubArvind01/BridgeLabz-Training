package com.questions.predicate;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		/*
			Scenario 1: Predicate (Condition Checking)
			
			1.In a student system, use a Predicate to check if a student is eligible for exam (attendance ≥ 75%).
			
			2.In an employee system, check if salary is greater than 30,000 using Predicate.
			
			3.In a bank application, validate whether withdrawal amount is valid using Predicate.
			
			4.In an e-commerce app, check if order amount is eligible for free delivery.
			
			5.Use Predicate to check whether a number is even or odd.
		 */
		
		
		System.out.println("1.In a student system, use a Predicate to check if a student is eligible for exam (attendance ≥ 75%).");
		int attendence = 80;
		Predicate<Integer> eligible = e-> e>=75;
		System.out.println(eligible.test(attendence));
		
		System.out.println("\n2.In an employee system, check if salary is greater than 30,000 using Predicate.");
		double salary = 5934;
		Predicate<Double> isSalary = s-> s>30000;
		System.out.println(isSalary.test(salary));
		
		System.out.println("\n3.In a bank application, validate whether withdrawal amount is valid using Predicate.");
		double amount = 90;
		double balance = 900;
		Predicate<Double> withdraw = a-> {
			if(amount>balance) {
				return false;
			}
			if(amount<=0) {
				return false;
			}
			else {
				return true;
			}
		};
		System.out.println(withdraw.test(amount));
		
		System.out.println("\n4.In an e-commerce app, check if order amount is eligible for free delivery.");
		double orderAmount = 400;
		Predicate<Double> freeDelivery = e-> {
			if(e>=500) {
				return true;
			}
			else {
				return false;
			}
		};
		System.out.println(freeDelivery.test(orderAmount));
		
		System.out.println("\n5.Use Predicate to check whether a number is even or odd.");
		int number = 90;
		Predicate<Integer> isEven = n-> n%2==0;
		System.out.println(isEven.test(number));
	}
}