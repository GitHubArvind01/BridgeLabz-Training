package com.question.tailorshop;
import java.time.*;
public class Main {

	public static void main(String[] args) {
		Order order[] = {new Order("Bottle",LocalDate.of(2022, 11, 9)), new Order("Iphone",LocalDate.of(2026, 10, 19)), new Order("Laptop",LocalDate.of(2027, 1, 29)), new Order("Chair",LocalDate.of(2026, 5, 13))};
				
		insertionSort(order,order.length);
		
		//display
		for(Order o:order) {
			System.out.println("\nProduct Name: "+o.productName);
			System.out.println("Order ID: "+o.orderId);
			System.out.println("Order Date: "+o.data);
		}
	}
	
	//sort
	public static void insertionSort(Order order[], int n) {
		
		for(int i=1;i<n;i++) {
			Order top = order[i];
			
			int j = i-1;
			while(j>=0) {
				if(order[j].data.isAfter(top.data)) {
					order[j+1] = order[j];
					j-=1;
				}else {
					break;
				}
			}
			
			order[j+1] = top;
		}	
	}
}