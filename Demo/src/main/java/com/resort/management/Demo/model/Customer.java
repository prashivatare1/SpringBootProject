package com.resort.management.Demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name ="customer")
@SecondaryTable(name ="cust_add" ,pkJoinColumns = @PrimaryKeyJoinColumn(name="customerid")) 
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CustomerId")
	String CustomerId;
	@Column(name = "FirstName")
	String FirstName;
	@Column(name = "MIDDELNAME")
	String MiddelName;
	@Column(name = "LastName")
	String LastName;
	@Column(name = "Mobile")
	String Mobile;
	@Column(name = "Gender")
	String Gender;
	@Column(name = "EmailId")
	String EmailId;
	@Column(name = "Password")
	String Password;
	
	@Column(name="addId" ,table="cust_add")
	String addId;
	@Column(name="address" ,table="cust_add")
	String address;
	@Column(name="city" ,table="cust_add")
	String city;
	@Column(name="zip" ,table="cust_add")
	String zip;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, String firstName, String middelName, String lastName, String mobile,
			String gender, String emailId, String password, String addId, String address, String city, String zip) {
		super();
		CustomerId = customerId;
		FirstName = firstName;
		MiddelName = middelName;
		LastName = lastName;
		Mobile = mobile;
		Gender = gender;
		EmailId = emailId;
		Password = password;
		this.addId = addId;
		this.address = address;
		this.city = city;
		this.zip = zip;
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

	public String getAddId() {
		return addId;
	}

	public void setAddId(String addId) {
		this.addId = addId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", FirstName=" + FirstName + ", MiddelName=" + MiddelName
				+ ", LastName=" + LastName + ", Mobile=" + Mobile + ", Gender=" + Gender + ", EmailId=" + EmailId
				+ ", Password=" + Password + ", addId=" + addId + ", address=" + address + ", city=" + city + ", zip="
				+ zip + "]";
	}
	
	
	
	
	
	
	
	
}
