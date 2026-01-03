package com.encapsulation.hospital;

public class InPatient extends Patient{
	private int days;
	
	public InPatient(int patientId, String name, int age, String diagnosis, int days) {
		super(patientId, name, age, diagnosis);
		this.days = days;
	}

	@Override
	double calculateBill() {
		return days * 2000;
	}

}
