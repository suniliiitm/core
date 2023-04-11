package com.sp;

public class Employee {

	String firstName;
	String middlename;
	String lastName;
	
	public Employee(String firstName, String middlename, String lastName) {
		super();
		this.firstName = firstName;
		this.middlename = middlename;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	 public String getFullName() {
	        return firstName + " " + middlename + " " + lastName;
	    }
	
	
	
}
