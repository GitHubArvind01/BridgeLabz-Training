package com.question.ambulanceroute;

public class Main {

	public static void main(String[] args) {
		HospitalManagement mangement = new HospitalManagement();
		mangement.addHospital("Emergency", true);
		mangement.addHospital("Radiology", true);
		mangement.addHospital("Surgery", true);
		mangement.addHospital("ICU", true);
		
		mangement.viewHospital();
		mangement.underMaintance("Surgery");
		mangement.viewHospital();
		
		mangement.admitPatient("ravi");
	}
}