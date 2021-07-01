package com.cts.core;

public class OfficeContact extends Contact{

	private String buildingName;
	private String companyName;
	private String contactPerson;
	
	public OfficeContact() {
		
	}

	
	public OfficeContact(String firstName, String lastName, long mobile, String buildingName, String companyName,
			String contactPerson) {
		super(firstName, lastName, mobile);
		this.buildingName = buildingName;
		this.companyName = companyName;
		this.contactPerson = contactPerson;
	}


	public String getBuildingName() {
		return buildingName;
	}


	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getContactPerson() {
		return contactPerson;
	}


	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}


	@Override
	public String toString() {
		return "OfficeContact [buildingName=" + buildingName + ", companyName=" + companyName + ", contactPerson="
				+ contactPerson + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getMobile()=" + getMobile() + "]";
	}


	
	
}