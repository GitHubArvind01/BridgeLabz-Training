package com.encapsulation.hospital;

abstract class Patient{
	private int patientId;
	private String name;
	private int age;
	private String diagnosis;
		
	public Patient(int patientId, String name, int age, String diagnosis) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.diagnosis = diagnosis;
	}
	
	//abstract method
	abstract double calculateBill();
	
	//concrete method
	public void getPatientDetails() {
		System.out.println("---------Patient Details-------------");
		System.out.println("Patient Id: "+patientId);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public String getDiagnosis() {
		return diagnosis;
	}
}
