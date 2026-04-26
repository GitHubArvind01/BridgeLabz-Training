package com.practices.jdbc.employeemanagementsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeManagement {
	SingletonConnection connection = SingletonConnection.getInstance();
	
	
	//add employee
	public void addEmployee(Employee e) throws SQLException{
		String sql = "INSERT INTO employee_data(emp_Name, emp_Department, emp_Salary) VALUES(?,?,?)";
		PreparedStatement statement = connection.getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		statement.setString(1, e.getEmployeeName());
		statement.setString(2, e.getDepartment());
		statement.setDouble(3, e.getSalary());
		int row = statement.executeUpdate();
		if(row>0) {
			ResultSet result = statement.getGeneratedKeys();
			if(result.next()) {
				int id = result.getInt(1);
				e.setEmpId(id);
				System.out.println("Added employee with id: "+id);
			}
		}
	}
	
	//view all employee
	public void viewAllEmployee() throws SQLException{
		String sql = "SELECT * FROM employee_data";
		PreparedStatement statement = connection.getConnection().prepareStatement(sql);
		ResultSet result = statement.executeQuery();
		while(result.next()) {
			Employee data = new Employee(result.getInt("emp_Id"),result.getString("emp_Name"),result.getString("emp_Department"), result.getInt("emp_Salary"));
			System.out.println(data.toString());
		}
	}
	
	//update employee data by id
	public void updateEmployeeSalary(int id, int salary) throws SQLException{
		String sql = "UPDATE employee_data SET emp_Salary = ? WHERE emp_Id = ?";
		PreparedStatement statement = connection.getConnection().prepareStatement(sql);
		statement.setInt(1, salary);
		statement.setInt(2,id);
		int row = statement.executeUpdate();
		if(row>0) {
			System.out.println("Employee salary updated!");
		}else {
			System.out.println("Operation not possible! may id not found");
		}
	}
	
	//delete employee by id
	public void deleteEmployeeById(int id) throws SQLException{
		String sql = "DELETE FROM employee_data WHERE emp_Id = ?";
		PreparedStatement statement = connection.getConnection().prepareStatement(sql);
		statement.setInt(1,id);
		int row = statement.executeUpdate();
		if(row>0) {
			System.out.println("Employee Deleted with id: "+id);
		}else {
			System.out.println("Operation not possible! may id not found");
		}
	}
	
	//Search employee by name
	public void SearchEmployeeByName(String name) throws SQLException{
		String sql = "SELECT * FROM employee_data WHERE emp_Name = ?";
		PreparedStatement statement = connection.getConnection().prepareStatement(sql);
		statement.setString(1, name);
		ResultSet result = statement.executeQuery();
		while(result.next()) {
			Employee ep = new Employee(result.getInt("emp_Id"),result.getString("emp_Name"),result.getString("emp_Department"),result.getInt("emp_Salary"));
			System.out.println(ep.toString());
		}
	}
}
