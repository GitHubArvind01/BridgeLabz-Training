package com.OopsScenarioBased.Quetion1;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//created object of bank
		Bank bank = new Bank("State Bank of India");
		
		while(true) {
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("For Open Account-> please enter 'O' : ");
			System.out.println("For Withdrawal Amount-> please enter 'W' : ");
			System.out.println("For Deposit Amount-> press 'D' :");
			System.out.println("Check Balance-> press 'B' :");
			System.out.println("Want to Exit-> press 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c) {
				case 'O':
					//call open account method by creating object
					
					//take name
					System.out.println("Enter your name: ");
					String name = sc.next();
					Customer c1 = new Customer(name);
					
					//take account number
					System.out.println("Enter your account Number: ");
					String accountNumber = sc.next();
					//take balance
					System.out.println("Enter your balance: ");
					double balance = sc.nextDouble();
					Account a1 = new Account(accountNumber,balance);
					
					//new -> open the account for customer
					bank.openAccount(c1, a1);
					break;
				case 'W':
					//take account number
					System.out.println("Enter the account Number: ");
					String accountNumber1  = sc.next();
					
					System.out.println("Enter the amount: ");
					double amt1  = sc.nextDouble();
					//call method for deposit
					bank.withdrawAmount(accountNumber1, amt1);
					break;
				case 'D':
					//take account number
					System.out.println("Enter the account Number: ");
					String accountNumber2  = sc.next();
					
					System.out.println("Enter the amount: ");
					double amt2  = sc.nextDouble();
					//call method for deposit
					bank.depositAmount(accountNumber2,amt2);
					break;
				case 'B':
					//take account number
					System.out.println("Enter the account Number: ");
					String accountNumber3  = sc.next();
					//call method to view balance
					bank.viewBalance(accountNumber3);
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
