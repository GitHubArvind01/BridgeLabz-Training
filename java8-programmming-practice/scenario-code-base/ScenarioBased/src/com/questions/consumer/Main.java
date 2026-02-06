package com.questions.consumer;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		/*
			Scenario 3: Consumer (Perform Action)
			
			1.Print student details using Consumer.
			
			2.Log employee login activity using Consumer.
			
			3.Print order confirmation message using Consumer.
			
			4.Display account balance using Consumer.
			
			5.Send notification message using Consumer.
		 */
		
		System.out.println("1.Print student details using Consumer.");
		String name = "ravi";
		Consumer<String> data = (s)->System.out.println(s);
		data.accept(name);
		
		
		
		System.out.println("\n2.Log employee login activity using Consumer.");
		Consumer<String> log = s-> System.out.println(s+" log success");
		log.accept("allu");
		
		
		System.out.println("\n3.Print order confirmation message using Consumer.");
		Consumer<String> order = o-> System.out.println(o+" order confirm");
		order.accept("laptop");
		
		System.out.println("\n4.Display account balance using Consumer.");
		Consumer<Double> display = s-> System.out.println("account balance :"+s);
		display.accept(599.3);
		
		
		System.out.println("\n5.Send notification message using Consumer.");
		Consumer<String> message = m-> System.out.println("notification sent to "+m);
		message.accept("ravi");
	}
}