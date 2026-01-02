package com.OopsScenarioBased.hospital;

abstract class Patient {
	private int patientId;
    private String name;
    private String medicalHistory; // sensitive
    protected boolean admitted;
    
	public Patient(int patientId, String name, String medicalHistory, boolean admitted) {
		this.patientId = patientId;
		this.name = name;
		this.medicalHistory = medicalHistory;
		this.admitted = admitted;
	}
    
    
	public int getPatientId() {
        return patientId;
    }

    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }

    public abstract void displayInfo();
}
