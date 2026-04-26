package com.encapsulation.hospital;

public class OutPatient extends Patient{
	
	public OutPatient(int patientId, String name, int age, String diagnosis) {
		super(patientId, name, age, diagnosis);
	}

	@Override
	double calculateBill() {
		return 500;
	}
}
