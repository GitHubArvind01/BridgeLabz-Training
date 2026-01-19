package com.collections.groupobjectsproperty;

public class Employee {
	String empName;

	public Employee(String empName) {
		this.empName = empName;
	}	
	 @Override
    public String toString() {
        return empName;
    }
}
