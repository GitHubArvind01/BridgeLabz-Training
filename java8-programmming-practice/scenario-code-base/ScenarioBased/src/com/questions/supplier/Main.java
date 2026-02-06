package com.questions.supplier;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		/*
		 	Scenario 4: Supplier (Provide Data)

			1.Generate OTP using Supplier.
			
			2.Generate random student ID using Supplier.
			
			3.Provide current date and time using Supplier.
			
			4.Provide default welcome message using Supplier.
			
			5.Generate random discount coupon using Supplier.
		 */
		
		System.out.println("1.Generate OTP using Supplier.");
		Random random = new Random();
		Supplier<Integer> otp =()-> random.nextInt(9999);
		System.out.println(otp.get());
		
	
		System.out.println("\n2.Generate random student ID using Supplier.");
		Supplier<Integer> id = () -> random.nextInt(999);
		System.out.println(id.get());
		
		System.out.println("\n3.Provide current date and time using Supplier.");
		Supplier<LocalDateTime> time = ()-> LocalDateTime.now();
		System.out.println(time.get());
		
		
		System.out.println("\n4.Provide default welcome message using Supplier.");
		Supplier<String> message = () -> "welcome allu";
		System.out.println(message.get());
		
		System.out.println("\n5.Generate random discount coupon using Supplier.");
		Supplier<Double> discount = ()-> random.nextDouble(99)+1;
		System.out.println(discount.get());
	}
}
