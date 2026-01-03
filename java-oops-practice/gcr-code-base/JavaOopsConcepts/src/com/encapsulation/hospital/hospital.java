package com.encapsulation.hospital;
import java.util.ArrayList;

public class hospital implements MedicalRecord{
	private ArrayList<Patient> in = new ArrayList<>();
	
	@Override
	public void addRecord(Patient patient) {
		System.out.println("-----------------------------------");
		System.out.println("Patient added.");
		
		in.add(patient);
		System.out.println("-----------------------------------");
	}

	@Override
	public void viewRecords() {
		System.out.println("\n----------------|-------------------");
		System.out.println("----------------|-------------------");
		System.out.println("	    View record");
		System.out.println("----------------|-------------------");
		System.out.println("----------------|-------------------");
		for(Patient p:in) {
			p.getPatientDetails();
			System.out.println("Bill: "+p.calculateBill());
			System.out.println("---------------------------");
		}
	}
//	private ArrayList<InPatient> in = new ArrayList<>();
//	//add patient
//	public void addRecord(InPatient inP) {
//		System.out.println("Patient added!");
//		in.add(inP);
//	}
//	
//	//view record
//	public void viewRecords(InPatient inP) {
//		if(in.contains(inP)) {
//			System.out.println("View record-");
//		}
//	}
//	
//	//remove patient
//	public void removePatient(InPatient ouP) {
//		if(in.contains(ouP)) {
//			in.remove(ouP);
//			System.out.println("Patient removed!");
//		}else {
//			System.out.println("Patient not found!");
//		}
//	}
//
//	@Override
//	public void addRecord() {
//		
//	}
//
//	@Override
//	public void viewRecords() {
//		
//	}
	
}
