package com.constructor.Level1;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e = new Employee("332SFS","Pharam",44343);
		e.displayEmployee();
		
		 System.out.println("\nUpdating Salary...");
        e.modifySalary(55000);
        e.displayEmployee();
        
		System.out.println("\n==== Manager Details ====");
        Manager m = new Manager("3233SKD", "HR", 75000, "Recruitment Team");
        m.displayManger();
	}
}
