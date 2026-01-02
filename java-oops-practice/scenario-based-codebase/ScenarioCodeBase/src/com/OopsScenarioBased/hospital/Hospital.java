package com.OopsScenarioBased.hospital;

public class Hospital {
	//attributes	
    private String hospitalName;
    private Patient patient;
    private Bill bill;
	
	//constructor
	public Hospital(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	public void registerPatient(Patient patient, double billAmount) {
        this.patient = patient;
        this.bill = new Bill(patient, billAmount);
        System.out.println("Patient Registered Successfully in " + hospitalName);
    }

    public void viewBill() {
        if (bill != null)
            bill.showBill();
        else
            System.out.println("No bill found!");
    }
    public void payBill(double amount) {
        if (bill == null) {
            System.out.println("No bill available!");
            return;
        }

        bill.pay(amount);

        if (bill.isPaid()) {
            System.out.println("Bill fully paid. Thank you!");
        }
    }
    public void updateStatus() {
        System.out.println("Patient discharged successfully.");
    }
	
}
