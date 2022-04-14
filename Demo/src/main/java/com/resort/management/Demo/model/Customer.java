package com.resort.management.Demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	String CustomerId;
	String FirstName;
	String MiddelName;
	String LastName;
	String Mobile;
	String Gender;
	String EmailId;
	String Password;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerId, String firstName, String middelName, String lastName, String mobile,
			String gender, String emailId, String password) {
		super();
		CustomerId = customerId;
		FirstName = firstName;
		MiddelName = middelName;
		LastName = lastName;
		Mobile = mobile;
		Gender = gender;
		EmailId = emailId;
		Password = password;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddelName() {
		return MiddelName;
	}
	public void setMiddelName(String middelName) {
		MiddelName = middelName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", FirstName=" + FirstName + ", MiddelName=" + MiddelName
				+ ", LastName=" + LastName + ", Mobile=" + Mobile + ", Gender=" + Gender + ", EmailId=" + EmailId
				+ ", Password=" + Password + "]";
	}
	
	
	
}
