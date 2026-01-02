package com.OopsScenarioBased.hospital;

public class OutPatient extends Patient {

	public OutPatient(int patientId, String name, String medicalHistory, boolean admitted) {
		super(patientId, name, medicalHistory, admitted);
		// TODO Auto-generated constructor stub
	}
	
	public void displayInfo() {
        System.out.println(getSummary() + " | OutPatient");
    }
}
