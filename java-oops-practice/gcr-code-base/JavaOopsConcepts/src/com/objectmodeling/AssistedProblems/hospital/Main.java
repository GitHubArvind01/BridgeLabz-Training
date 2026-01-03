package com.objectmodeling.AssistedProblems.hospital;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//created object of bank
		Hospital hospital = new Hospital("Apolo Hospital");
		
		while(true) {
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("Register Patient-> Press 'R' : ");
			System.out.println("View Bill-> Press 'V' : ");
			System.out.println("For Pay bill-> Press 'P' :");
			System.out.println("Update Patient Status-> press 'U': ");
			System.out.println("Want to Exit-> Press 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c) {
				case 'R':
					//ask patient input for register 
					Patient p = new InPatient(101,"ravi","migeration",true,5);
					hospital.registerPatient(p, 20000);
					break;
				case 'V':
					//ask patient to paitentID for view bill respective
					hospital.viewBill();
					break;
				case 'P':
					//patient want to pay bill then ask how much they are going to pay
					System.out.println("Enter amount to pay: ");
					double amount = sc.nextDouble();
					hospital.payBill(amount);
					break;
				case 'U':
					//if patient leave the hospital then update their status leave
					hospital.updateStatus();
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
