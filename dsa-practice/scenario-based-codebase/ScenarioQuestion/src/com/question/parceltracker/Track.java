package com.question.parceltracker;

public class Track {
	Delivery head;
	
	//add update
	public void addStatus(String status) {
		Delivery newStatus = new Delivery(status);
		
		if(head==null) {
			head = newStatus;
			System.out.println("Added delivery update.");
			return;
		}
		Delivery temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.next = newStatus;
		System.out.println("Added last status update");
	}
	
	//view update
	public void viewStatus() {
		System.out.println();
		Delivery temp = head;
		while(temp.next!=null) {
			System.out.print(temp.status+"-> ");
			temp = temp.next;
		}
		System.out.println("-> "+temp.status);
	}
}
