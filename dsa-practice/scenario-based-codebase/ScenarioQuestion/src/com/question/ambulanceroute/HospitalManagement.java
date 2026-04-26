package com.question.ambulanceroute;
import java.util.Stack;

public class HospitalManagement {
	Hospital head;
	static Stack<Hospital> underMaintainenc = new Stack<>();
	
	//add hospital
	public void addHospital(String name, boolean status) {
		Hospital newHospital = new Hospital(name,status);
		
		//check head
		if(head==null) {
			head = newHospital;
			head.next = newHospital;
			System.out.println("Added first node");
			return;
		}
		
		Hospital temp = head;
		
		while(temp.next!=head) {
			temp = temp.next;
		}
		
		temp.next = newHospital;
		newHospital.next = head;
		System.out.println("Add last node");
	}
	
	//view hospital
	public void viewHospital() {
		System.out.println("--------------------Hospital List-------------------------");
		Hospital hospital = head;
		
		while(hospital.next!=head) {
			System.out.print(hospital.name+"-> ");
			hospital = hospital.next;
		}
		System.out.print(hospital.name+"-> ");
		System.out.println("back to "+head.name);
		System.out.println("----------------------------------------------------------");
	}
	
	//Maintain-enc
	public void underMaintance(String name) {
		//delete first head node
		if(head.name.equals(name)) {
			Hospital temp = head;
			while(temp.next!=head) {
				temp = temp.next;
			}
			head= head.next;
			temp.next = head;
			System.out.println("first deleted.");
			return;
		}
		
		//last node delete
		Hospital curr = head;
		Hospital prev = null;
		while(curr.next!=head) {
			prev = curr;
			curr = curr.next;
		}
		
		if(curr.name.equals(name)) {
			prev.next = head;
			System.out.println("Last deleted.");
			return;
		}
		
		//delete middle node
		Hospital cur = head;
		Hospital pre = null;
		while(cur.next!=head) {
			if(cur.name.equals(name)) {
				pre.next = cur.next;
				System.out.println("middle deleted.");
				return;
			}
			pre = cur;
			cur = cur.next;
		}
	}
	
	//admit patient
	public void admitPatient(String name) {
		Hospital temp = head;
		
		while(temp.next!=null) {
			if(temp.availability) {
				System.out.println("Patient admited in "+temp.name);
				return;
			}
			temp = temp.next;
		}
		if(temp.availability) {
			System.out.println("Patient admited in "+temp.name);
			return;
		}
	}
}
