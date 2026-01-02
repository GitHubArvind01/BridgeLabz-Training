package com.OopsScenarioBased.hospital;

class InPatient extends Patient{
	
	private int daysAdmitted;
	
	public InPatient(int patientId, String name, String medicalHistory, boolean admitted, int daysAdmitted) {
		super(patientId, name, medicalHistory, admitted);
		this.daysAdmitted = daysAdmitted;
	}
	
	 public int getDaysAdmitted() {
	      return daysAdmitted;
	 }
	
	public void displayInfo() {
        System.out.println(getSummary() + " | InPatient | Days: " + daysAdmitted);
    }
}
