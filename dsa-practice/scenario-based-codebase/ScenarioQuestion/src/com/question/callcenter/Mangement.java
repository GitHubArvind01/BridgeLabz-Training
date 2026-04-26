package com.question.callcenter;
import java.util.*;

public class Mangement {
	static Queue<Customer> customerList = new LinkedList<>();
	static HashMap<String, Integer> freq = new HashMap<>();
	
	//call 
	public void callRequest(Customer newCustomer) {
		customerList.add(newCustomer);
		freq.put(newCustomer.phoneNumber, freq.getOrDefault(newCustomer.phoneNumber, 0)+1);
		System.out.println("call request saved in queue.");
	}
	
	//call back customer
	public void callbackCustomer() {
		int i=1;
		while(!customerList.isEmpty()) {
			Customer temp = customerList.poll();
			
			System.out.println("\n--------call back "+ (i) + "---------");
			System.out.println("Name: "+temp.name);
			System.out.println("Number: "+temp.phoneNumber);
			System.out.println("---------------------------");
			i+=1;
		}
	}
	
	//view history
	public void viewHistory() {
		for(var cus:freq.entrySet()) {
			System.out.println("\nNumber: "+cus.getKey()+"\nCall histroy: "+cus.getValue());
		}
	}
}
