package com.keywords;

public class Employee {
	 // Static variable shared by all employees
	   private static String companyName;
	   private static int totalEmployees = 0;
	   // Instance variables
	   private String name;
	   private final int id; // Final variable to ensure the employee ID cannot be modified
	   private String designation;
	   
	   //constructor
	   public Employee(String name, int id, String designation) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		totalEmployees++;
	   }
	   
	   // Static method to set the company name
	   public static void setCompanyName(String name) {
	       companyName = name;
	   }
	   // Static method to display the total number of employees
	   public static void displayTotalEmployees() {
	       System.out.println("Total Employees: " + totalEmployees);
	   }
	   
	   //getter and setter
	   public String getName() {
		   return name;
	   }

	   public int getId() {
		   return id;
	   }

	   public String getDesignation() {
		   return designation;
	   }
	   
	   //display employee
	   public void displayEmployee() {
		   if(this instanceof Employee) {
			   System.out.println("\n--------Employe details----------");
			   System.out.println("Compnay Name: "+companyName);
			   System.out.println("Employee Name: "+name);
			   System.out.println("Employee Id: "+id);
			   System.out.println("Designation: "+designation);
			   System.out.println("--------------------------------");
		   }else {
			   System.out.println("This employee not belong to instance of class!");
		   }
	   }
	public static void main(String[] args) {
		
	   // Set the company name (static variable)
       Employee.setCompanyName("Microsoft Inc.");
       
       // Create new employee instances
       Employee emp1 = new Employee("Allu", 1001, "Software Engineer");
       Employee emp2 = new Employee("Arvind", 1002, "Product Manager");
      
       // Display total number of employees
       Employee.displayTotalEmployees();
       
       // Display employee details
       emp1.displayEmployee();
       emp2.displayEmployee();
   }
}
