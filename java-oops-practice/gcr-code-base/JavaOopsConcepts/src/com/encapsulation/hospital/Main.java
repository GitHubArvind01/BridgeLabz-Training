package com.encapsulation.hospital;

public class Main {

	public static void main(String[] args) {
		Patient p1 = new InPatient(101,"elus",25,"fever",5);
		
		Patient p2 = new OutPatient(102, "Ravi", 30, "Cold");
		 
		MedicalRecord m1 = new hospital();
		m1.addRecord(p1);
		m1.addRecord(p2);
		
		m1.viewRecords();
	}
}
