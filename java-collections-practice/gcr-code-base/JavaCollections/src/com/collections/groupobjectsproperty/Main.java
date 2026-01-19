package com.collections.groupobjectsproperty;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("ravi");
		Employee e3 = new Employee("kali");
		Employee e2 = new Employee("sunny");
		
		List<Employee> emp1 = new ArrayList<>();
		emp1.add(e1);
		emp1.add(e2);
		emp1.add(e3);
		
		Employee e4 = new Employee("alice");
		Employee e5 = new Employee("zack");
		
		List<Employee> emp2 = new ArrayList<>();
		emp2.add(e4);
		emp2.add(e5);
		
		Employee e6 = new Employee("allu");
		
		List<Employee> emp3 = new ArrayList<>();
		emp3.add(e6);
		
		Department d1 = new Department("HR");
		Department d2 = new Department("IT");
		Department d3 = new Department("Marketing");
		
		
		Map<Department, List<Employee>> emp = new HashMap<>();
		emp.put(d1, emp1);
		emp.put(d2, emp2);
		emp.put(d3, emp3);
		
		
		System.out.println(emp.toString());
	}
}
