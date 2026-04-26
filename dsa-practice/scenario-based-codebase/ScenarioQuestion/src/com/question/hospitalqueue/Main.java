package com.question.hospitalqueue;

public class Main {

	public static void main(String[] args) {
		Patient[] patient = {new Patient("ravi",3),new Patient("kali",6),new Patient("suriya",9),new Patient("alice",1),new Patient("sunny",5)};
		bubbleSort(patient,patient.length);
		
		//display
		for(Patient pat : patient) {
			System.out.println(pat.name+ "<->"+pat.id);
		}
	}
	
	static public void bubbleSort(Patient[] patient, int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(patient[j].id<=patient[j+1].id) {
					int temp = patient[j].id;
					patient[j].id = patient[j+1].id;
					patient[j+1].id = temp;
				}
			}
		}
	}
}
