package com.OopsScenarioBased.vehiclerental;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("For Car Rent-> please enter 'C' : ");
			System.out.println("For Truck Rent-> please enter 'T' : ");
			System.out.println("For Bike Rent-> press 'B' :");
			System.out.println("See Rent Details-> press 'V' :");
			System.out.println("Want to Exit-> press 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c) {
				case 'C':
					//take input - name, Car number, days
					
					break;
				case 'T':
					//take input - name, Truck number, days
					
					break;
				case 'B':
					//take input - name, Bike number, days
					
					break;
				case 'V':
					//take input - Vehicle number
					
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
