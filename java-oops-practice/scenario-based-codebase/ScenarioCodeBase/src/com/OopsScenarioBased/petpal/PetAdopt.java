package com.OopsScenarioBased.petpal;
import java.util.*;

public class PetAdopt {
	static Map<Integer,Pet> adoptPet = new HashMap<>();

	//adopt pet
	public void adoptPet(int id, Pet newPet) {
		for(var pets:adoptPet.entrySet()) {
			if(pets.getKey()==id) {
				System.out.println("This id already used! please enter other user id to adopt pet.");
				return;
			}
		}
		adoptPet.put(id, newPet);
		System.out.println("Pet adopt Success.");
	}
	
	//return pet 
	
	@SuppressWarnings("unlikely-arg-type")
	public void returnPet(int id, Pet newPet) {
		for(var pets:adoptPet.entrySet()) {
			if(pets.getKey()==id) {
				adoptPet.remove(newPet);
				System.out.println("Pet return success!");
				return;
			}
		}
		System.out.println("you have not adopt any pet yet! So you can't return pet.");
	}
	
	//pet care options
	public void petCare() {
		
	}
}
