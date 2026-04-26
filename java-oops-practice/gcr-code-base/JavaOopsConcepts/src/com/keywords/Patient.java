package com.keywords;

public class Patient {
   // Static variable shared among all patients
   private static String hospitalName;
   private static int totalPatients = 0;
   // Instance variables
   private final String patientID; // Final variable to uniquely identify each patient
   private String name;
   private int age;
   private String ailment;
   
   //constructor
   public Patient(String patientID, String name, int age, String ailment) {
	this.patientID = patientID;
	this.name = name;
	this.age = age;
	this.ailment = ailment;
	totalPatients++;
   }
   
   //get total patients
   public static int getTotalPatients() {
	   return totalPatients;
   }
   
   //set hospital Name
   public static void setHospitalName(String name) {
	   hospitalName = name;
   }
   
   public void displayPatientDetails() {
       // Using 'instance of' to verify the object's type before displaying details
       if (this instanceof Patient) {
    	   System.out.println("\n---------Hospital Details-----------");
           System.out.println("Hospital Name: " + hospitalName);
           System.out.println("Patient ID: " + patientID);
           System.out.println("Name: " + name);
           System.out.println("Age: " + age);
           System.out.println("Ailment: " + ailment);
           System.out.println("\n-------------------------------------");
       } else {
           System.out.println("The object is not an instance of the Patient class.");
       }
   }
   
   //getter and setter
  
   public String getPatientID() {
	   return patientID;
   }

   public String getName() {
	   return name;
   }

   public int getAge() {
	   return age;
   }

   public String getAilment() {
	   return ailment;
   }

   public static void main(String[] args) {
	   
	// Set the hospital name (static variable)
       Patient.setHospitalName("City Hospital");
       
       // Create new patient instances
       Patient patient1 = new Patient("P001","Lathika",35 ,"Flu");
       Patient patient2 = new Patient("P002","Lidiya", 55,"Fracture");
       
       // Display total number of patients admitted
       System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
       
       // Display patient details
       patient1.displayPatientDetails();
       System.out.println();
       
       patient2.displayPatientDetails();
	}
}
