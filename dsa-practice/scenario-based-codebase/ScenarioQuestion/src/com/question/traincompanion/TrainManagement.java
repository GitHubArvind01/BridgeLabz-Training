package com.question.traincompanion;

public class TrainManagement {
	Train head;
	Train curr;
	//add compartment 
	public void addCompartment(Train newTrain) {
		if(head==null) {
			head = newTrain;
			curr  = newTrain;
			System.out.println("Add compartment node first");
			return;
		}
		
		curr.next = newTrain;
		newTrain.prev = curr;
		curr = newTrain;
	}
	
	//view compartment
	public void viewCompartment() {
		int i = 1;
		Train temp = head;
		while(temp!=null) {
			System.out.println("\n-------------Train Compartment "+(i)+"-------------------");
			System.out.println(temp.compartmentName);
			System.out.println(temp.compartmentNumber);
			System.out.println("---------------------------------------------------");
			i+=1;
			temp = temp.next;
		}
	}
	
	//search for pentry
	public void searchPreviousePentry() {
		Train temp = curr;
		while(temp!=null) {
			if(temp.compartmentName.equalsIgnoreCase("pantry")) {
				System.out.println("\nPantry found in previouse compartment number "+temp.compartmentNumber);
				return;
			}
			temp = temp.prev;
		}
		System.out.println("pantry not found in previouse compartment!");
	}
	
	public void searchForwardPentry() {
		Train temp = curr;
		while(temp!=null) {
			if(temp.compartmentName.equalsIgnoreCase("pantry")) {
				System.out.println("\nPantry found in forward compartment number "+temp.compartmentNumber);
				return;
			}
			temp = temp.next;
		}
		System.out.println("pantry not found in forward compartment!");
	}
}
