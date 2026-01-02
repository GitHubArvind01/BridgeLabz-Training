package com.encapsulation.employeemanagement;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new FullTimeEmployee (101,"ramu",12000);
		Employee e2 = new PartTimeEmployee (101,"ramu",20,12000);
		
		ArrayList<Employee> employees = new Arraylist<>();
		
		((Department) e1).assignDepartment("IT");
        ((Department) e2).assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Department: " + ((Department) emp).getDepartmentDetails());
            System.out.println("-------------------------");
        }
	}
}
