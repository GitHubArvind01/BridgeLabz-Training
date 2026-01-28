package com.questions.employee;

import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee ramu = new Employee(101,"ramu",21,"male","IT",5.5,980000);
		Employee sujata = new Employee(102,"sujta",31,"female","IT",2,70000);
		Employee kali = new Employee(103,"kali",37,"male","Automation",5.5,1390000);
		Employee ravi = new Employee(104,"ravi",45,"male","Pharma",5.5,890000);
		Employee suriya = new Employee(105,"suriya",32,"male","Hardware",5.5,90000);
		Employee soniya = new Employee(106,"soniya",55,"female","HR",5,30000);
		
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
		System.out.println(		data.employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge))));
	}
}