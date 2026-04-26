package com.question.smartcheckout;
import java.util.*;

public class Customer {
	static Queue<Customer> customerList = new LinkedList<>();
	
	static int counter = 101;
	String name;
	int cusId;
	
	public Customer(String name) {
		this.cusId = counter++;
		this.name = name;
	}
	
	public void addCustomer(Customer cus) {
		customerList.add(cus);
		System.out.println("Customer Added-> your id: "+cusId);
	}	
}
