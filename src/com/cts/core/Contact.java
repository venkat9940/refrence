package com.cts.core;

public class Contact {

	private String firstName;
	private String lastName;
	private long mobile;
	
	public Contact() {
		
	}

	public Contact(String firstName, String lastName, long mobile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
}