package com.practices.jdbc.employeemanagementsystem;

public class Employee {
	private String employeeName;
	private String department;
	private int salary;
	private int empId;
	
	public Employee(String employeeName, String department, int salary) {
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}
	
	  // Constructor with ID (for fetch from DB)
    public Employee(int empId, String employeeName, String department, int salary) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", department=" + department + ", salary=" + salary
				+ ", empId=" + empId + "]";
	}
}
