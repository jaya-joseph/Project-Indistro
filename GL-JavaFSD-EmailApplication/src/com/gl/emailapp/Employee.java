package com.gl.emailapp;

public class Employee {

	private String firstName, lastName, department, emailID;
	
	Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}
