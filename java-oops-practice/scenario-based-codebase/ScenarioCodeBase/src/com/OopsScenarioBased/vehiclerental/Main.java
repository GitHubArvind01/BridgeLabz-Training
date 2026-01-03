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
					System.out.println("Enter name: ");
					String name = sc.nextLine();
					
					System.out.println("Enter the Car Number: ");
					String carNumber = sc.next();
					
					System.out.println("Enter the days for rent: ");
					int rent = sc.nextInt();
					
					System.out.println("Enter the rent price: ");
					double baseRate = sc.nextDouble();
					
					Rentable r = new Bike(baseRate,carNumber);
					
					Customer cus = new Customer(name);
					cus.rentVehicle(r, rent);
					break;
				case 'T':
					//take input - name, Truck number, days
					System.out.println("Enter name: ");
					String name2 = sc.nextLine();
					
					System.out.println("Enter the Truck Number: ");
					String carNumber2 = sc.next();
					
					System.out.println("Enter the days for rent: ");
					int rent2 = sc.nextInt();
					
					System.out.println("Enter the rent price: ");
					double baseRate2 = sc.nextDouble();
					
					Rentable r2 = new Bike(baseRate2,carNumber2);
					
					Customer cus2 = new Customer(name2);
					cus2.rentVehicle(r2, rent2);
					break;
				case 'B':
					//take input - name, Bike number, days
					System.out.println("Enter name: ");
					String name3 = sc.nextLine();
					
					System.out.println("Enter the Car Number: ");
					String carNumber3 = sc.next();
					
					System.out.println("Enter the days for rent: ");
					int rent3 = sc.nextInt();
					
					System.out.println("Enter the rent price: ");
					double baseRate3 = sc.nextDouble();
					
					Rentable r3 = new Bike(baseRate3,carNumber3);
					
					Customer cus3 = new Customer(name3);
					cus3.rentVehicle(r3, rent3);
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
