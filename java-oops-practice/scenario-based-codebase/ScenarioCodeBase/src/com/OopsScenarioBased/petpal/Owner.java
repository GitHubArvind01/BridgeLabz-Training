package com.OopsScenarioBased.petpal;
import java.util.*;

public class Owner {
	static int i = 1;
	static List<User> userData = new ArrayList<>();
	static List<Pet> petData = new ArrayList<>();
	
	//method that -> user can add -> then user can adopt any pet
	public void addUser(User newUser) {
		userData.add(newUser);
		System.out.println("User added!");
	}
	//method to remove user
	public void removeUser(User newUser) {
		userData.remove(newUser);
		System.out.println("User removed!");
	}
	
	//add pet 
	public void addPet(Pet newPet) {
		petData.add(newPet);
		System.out.println("Pet added!");
	}
	//remove pet
	public void removePet(Pet newPet) {
		petData.remove(newPet);
		System.out.println("Removed pet!");
	}
	
	//method that -> owner can see their customer
	public void viewUser() {
		for(User user:userData) {
			System.out.println("-------------User"+(i)+"-------------------");
			System.out.println("User ID: "+user.getUserId());
			System.out.println("User Name: "+user.getName());
			boolean check = false;
			System.out.println("---Pet Adpot status---");
			for(var adopt : PetAdopt.adoptPet.entrySet()) {
				if(adopt.getKey()==user.getUserId()) {
					System.out.println(adopt.getValue().getType());
					check = true;
				}
			}
			if(!check) {
				System.out.println("No Any pet adpot!");
			}
			System.out.println("---------------------------------");
			i+=1;
		}
	}
	
	//we show them all pet options
	public void showPetOptions() {
		int petNumber = 1;
		
		System.out.println("---------------Here is the Pet List----------------------");
		for(Pet pets : petData) {
			System.out.println("------------- Pet Number->"+(petNumber)+" --------------");
			System.out.println("Pet Name: "+pets.getName());
			System.out.println("Pet Type: "+pets.getType());
			System.out.println("Pet Age: "+pets.getAge());
			System.out.println("----------------------------");
			petNumber+=1;
		}
		System.out.println("---------------------------------------------------------");
	}
}
