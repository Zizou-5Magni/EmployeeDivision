package com.mohammed.safwat.ed;

public class Employee {
	//Instance variables
	private int employeeID;
	private String employeeName;
	private String title;
	private int attendance;
	
	//Superclass Constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructor using fields
	public Employee(int employeeID, String employeeName, String title, int attendance) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.title = title;
		this.attendance = attendance;
	}
	
	//Getters and Setters using
	public void setEmployeeID(int id) {
		this.employeeID = id;
	}
	public void setEmployeeName(String name) {
		this.employeeName = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAttendance(int att) {
		this.attendance = att;
	}
	

}
