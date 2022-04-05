package com.mohammed.safwat.ed.id;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.mohammed.safwat.ed.Employee;
import com.mohammed.safwat.ed.exceptions.EmployeeNotFoundException;

public class EmployeeDSMySqlImp implements EmployeeDS{
	
	//Database variables (importing jdbs interfaces for each)
	//These are used to conncet to db, retrive data from db and send data to db. 
	private Connection cn = null;
	private PreparedStatement st = null;
	private ResultSet rs = null;
	//Commands to perform all database operations
	//? represent the values for the employee table
	public static final String INSERT_COMMAND="INSERT INTO employee VALUES(?,?,?,?)";
	public static final String UPDATE_COMMAND="UPDATE employee SET empname=?, title=?, attendance=? WHERE empid=?";
	public static final String  DELETE_COMMAND="DELETE FROM employee WHERE empid=?";
	public static final String FIND_COMMAND="SELECT * FROM employee WHERE empid=?";
	public static final String SELECT_ALL="SELECT * FROM employee";
	
	//start connect from database using constructor
	public EmployeeDSMySqlImp() {
		try {
			cn = DriverManager.getConnection(EmployeeDS.URL, EmployeeDS.USERNAME, EmployeeDS.PASSWORD);
		} catch (SQLException e) {
			System.out.println("Unable to establish a connection with database..");
			e.printStackTrace();
		}
	}

	@Override
	public void addEmployee(Employee e) {
		int i = 0;
		
		try {
			st = cn.prepareStatement(INSERT_COMMAND);	//prepare statement using Insert command
			st.setInt(1, e.getEmployeeID());		//fill details for all values
			st.setString(2, e.getEmployeeName());
			st.setString(3, e.getTitle());
			st.setInt(4, e.getAttendance());
			i = st.executeUpdate();
			
		} catch (SQLException e1) {
			System.out.println("Adding record failed..execution failed.");
			e1.printStackTrace();
		}
		//When record sucessfully added to db
		if(i > 1) {
			System.out.println("Record added..");
		}
	}

	@Override
	public void deleteEmployee(int employeeID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
