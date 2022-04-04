package com.mohammed.safwat.ed.id;
import java.util.List;
//This interface will contain many declarations for employee functionality such as adding, deleteing
//updating, finding an employee and showing all employees TO interact with the database table.
//In addition, we must include all my MySql properties such as Driver class name, username, URL, password. 

import com.mohammed.safwat.ed.Employee;
import com.mohammed.safwat.ed.exceptions.EmployeeNotFoundException;

public interface EmployeeDS {
	
	//Abstract methods for employee functionality regarding database
	public abstract void addEmployee(Employee e);
	
	public abstract void deleteEmployee(int employeeID);
	
	public abstract void updateEmployee(Employee e);
	
	public abstract Employee findEmployee(Employee e) throws EmployeeNotFoundException;
	
	public List<Employee> showAllEmployees();
	
	//MySql properties 
	public static final String URL="jdbc:mysql://localhost:3306/mysql";
	public static final String USERNAME="root";
	public static final String PASSWORD="ahmedAk88*";
	//Declare driver class: used to load driver class
	public static final String DRIVER_CLASSNAME="com.mysql.jdbc.Driver";

	
	
}
