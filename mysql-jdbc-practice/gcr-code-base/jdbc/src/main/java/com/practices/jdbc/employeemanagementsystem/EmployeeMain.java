package com.practices.jdbc.employeemanagementsystem;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		EmployeeManagement management = new EmployeeManagement();
		try {
			management.addEmployee(new Employee("sampth","CORE",79999));
			management.addEmployee(new Employee("ravi","HR",4433333));
			management.addEmployee(new Employee("surya","MBA",89999));
			management.addEmployee(new Employee("sonu","MCA",35532));
			management.addEmployee(new Employee("alice","Pharma",65699));
			management.addEmployee(new Employee("adam","Hardare",99990));
			
			management.updateEmployeeSalary(1, 88888888);
			management.deleteEmployeeById(2);
			management.addEmployee(new Employee("ravi","Electronics",555555));
			management.SearchEmployeeByName("ravi");
			
			management.viewAllEmployee();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
