package com.question.trafficmanager;

public class Trafic {
	Vehicle head;
	Vehicle curr;
	static int count = 0;
	
	//add vehicle
	public void addVehicle(Vehicle newVehicle) {
		if(count>10) {
			System.out.println("Sorry! Queue is overflow.");
			return;
		}
		if(head==null) {
			head = curr = newVehicle;
			newVehicle.next = head = curr;
			System.out.println("Added the first vehicle");
			count+=1;
			return;
		}
		
		//add the last node
		curr.next = newVehicle;
		newVehicle.next = head;
		curr = newVehicle;
		count+=1;
		System.out.println("Added last vehicle");
	}
	
	//view vehicle
	public void viewVehicle() {
		System.out.println("\n------------------------Trafic-----------------------------");
		Vehicle temp = head;
		while(temp.next!=head) {
			System.out.println("Vehicle number -> "+temp.vehicleNumber);
			temp = temp.next;
		}
		System.out.println("Vehicle number -> "+temp.vehicleNumber);
		System.out.println("-----------------------------------------------------------");
	}
	
	//remove vehicle by its 
	public void removeVehicle(String name) {
		if(head==null) {
			System.out.println("Can't Remove! Vehicle list is empty");
			return;
		}
		
		//this will remove 
		if(head.next==head && head.vehicleNumber.equalsIgnoreCase(name)) {
			head = null;
			System.out.println("Head and Pointing Head vehicle node removed.");
			count-=1;
			return;
		}
		
		//delete middle or last element
		Vehicle last = head;
		Vehicle prev = null;
		
		do {
			if(last.vehicleNumber.equalsIgnoreCase(name)) {
				if(head==last) {
					Vehicle end = last;
					while(end.next!=head) {
						end = end.next;
					}
					
					head = head.next;
					end.next = head;
					System.out.println("First node deleted");
				}
				else {
					prev.next = last.next;
					System.out.println("Node deleted.");
				}
				count-=1;
				return;
			}
			prev = last;
			last = last.next;
		}while(last!=head);
	}
}
