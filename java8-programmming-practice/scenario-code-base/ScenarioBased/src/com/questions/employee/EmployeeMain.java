package com.questions.employee;

import java.util.Comparator;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee ramu = new Employee(101,"ramu",21,"male","IT",2015,980000);
		Employee sujata = new Employee(102,"sujta",31,"female","IT",2022,70000);
		Employee kali = new Employee(103,"kali",37,"male","Automation",2014,1390000);
		Employee ravi = new Employee(104,"ravi",45,"male","Pharma",2011,890000);
		Employee suriya = new Employee(105,"suriya",32,"male","Hardware",2000,90000);
		Employee soniya = new Employee(106,"soniya",55,"female","HR",2026,30000);
		
		EmployeeDataCenter data = new EmployeeDataCenter();
		data.add(ramu);
		data.add(kali);
		data.add(ravi);
		data.add(suriya);
		data.add(soniya);
		data.add(sujata);
		
		//1. How many male and female employees are there in the organization ?
		System.out.println("1. How many male and female employees are there in the organization ?");
		System.out.println(data.employeeList.stream()
											.collect(
													Collectors.groupingBy(
															Employee::getGender,Collectors.counting()
															)
													)
											);
		
		//2. Print the name of all departments in the organization ?
		System.out.println("\n2. Print the name of all departments in the organization ?");
		data.employeeList.stream()
						.map(Employee::getDepartment)
						.distinct()
						.collect(Collectors.toList())
						.forEach(System.out::println);
		
		
		//3. What is the average age of male and female employees ?
		System.out.println("\n3. What is the average age of male and female employees ?");
		System.out.println(data.employeeList.stream()
											.collect(Collectors.groupingBy(Employee::getGender,Collectors
											.averagingInt(Employee::getAge)
														)
													)
												);
		
		//4. Get the details of highest paid employee in the organization ?
		System.out.println("\n4. Get the details of highest paid employee in the organization ?");
		System.out.println(
					data.employeeList.stream()
									.collect(Collectors
											.maxBy(Comparator
													.comparing(Employee::getSalary)))
				);
		
		
		//5. Get the names of all employees who have joined after 2015 ?
		System.out.println("\n 5. Get the names of all employees who have joined after 2015 ?");
		data.employeeList.stream()
							.filter(Employee-> Employee.getYearOfJoining()>=2015)
							.forEach(System.out::println);
		
		//6. Count the number of employees in each department ?
		System.out.println("\n6. Count the number of employees in each department ?");
		System.out.println(data.employeeList.stream()
											.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
		
		
		
		//7. What is the average salary of each department ?
		System.out.println("\n7. What is the average salary of each department ?");
		System.out.println(
					data.employeeList.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment,Collectors
							.averagingDouble(Employee::getSalary)))
				);
	}
}