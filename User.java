package com.retail.task;

public class User 
{
	private String Id; 
	private String Name; 
	private String UserType; 
	private String MobileNumber; 
	private String EmailId;
	private String RegisteredDate;

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getRegisteredDate() {
		return RegisteredDate;
	}
	public void setRegisteredDate(String registeredDate) {
		RegisteredDate = registeredDate;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", UserType=" + UserType + ", MobileNumber=" + MobileNumber
				+ ", EmailId=" + EmailId + ", RegisteredDate=" + RegisteredDate + "]";
	}
}
