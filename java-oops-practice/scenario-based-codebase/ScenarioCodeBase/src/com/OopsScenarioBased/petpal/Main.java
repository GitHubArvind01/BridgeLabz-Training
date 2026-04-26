package com.OopsScenarioBased.petpal;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//they can 
		Cat mimi = new Cat("mini",2);	
		Dog tommy = new Dog("mini",4);
		Cat kali = new Cat("mini",7);
		
		
		
		//owner add user
		Owner owner = new Owner();
		owner.addPet(mimi);
		owner.addPet(tommy);
		owner.addPet(kali);
		
		//adopt class object
		PetAdopt adopt = new PetAdopt();
		
		//here work start
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("For Pet Adopt-> please enter 'P' : ");
			System.out.println("For Pet Return-> please enter 'R' : ");
			System.out.println("Want to Care Pet-> enter 'C': ");
			System.out.println("For exit quiz -> enter 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'P':
					System.out.println("Please Enter your name: ");
					String name = sc.nextLine();
					sc.nextLine();
			
					System.out.println("Enter your Random 4 digit  User ID: ");
					int id = sc.nextInt();

					User newUser = new User(id,name);
					owner.addUser(newUser);
					//now we show them three pet which one they want to adopt
					owner.showPetOptions();
					System.out.println("Enter the pet number to adopt!");
					int number = sc.nextInt();
					if(number>3 || number<0) {
						System.out.println("Invalid pet number!");
						break;
					}
					if(number==1) {
						adopt.adoptPet(id, mimi);
					}
					if(number==2) {
						adopt.adoptPet(id, tommy);
					}
					if(number==3) {
						adopt.adoptPet(id, kali);
					}
					break;
				case 'R':
					System.out.println("Enter your Random 4 digit  User ID: ");
					int userId = sc.nextInt();
					
					System.out.println("Enter your pet numnber: ");
					int petNumber2 = sc.nextInt();
					if(petNumber2>3 || petNumber2<0) {
						System.out.println("Invalid pet number!");
						break;
					}
					if(petNumber2==1) {
						adopt.returnPet(userId, mimi);
					}
					if(petNumber2==2) {
						adopt.returnPet(userId, tommy);
					}
					if(petNumber2==3) {
						adopt.returnPet(userId, kali);
					}
					break;
				case 'C':
					System.out.println("Enter your pet numnber: ");
					int petNumber3 = sc.nextInt();
					if(petNumber3>3 || petNumber3<0) {
						System.out.println("Invalid pet number!");
						break;
					}
					if(petNumber3==1) {
						mimi.play();
					}
					if(petNumber3==2) {
						tommy.feed();
					}
					if(petNumber3==3) {
						kali.makeSound();
					}
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
