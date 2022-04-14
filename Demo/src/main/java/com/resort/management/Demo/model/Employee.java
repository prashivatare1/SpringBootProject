package com.resort.management.Demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Employee {

	@Id
	String EmployeeId;
	String FirstName;
	String MiddleName;
	String LastName;
	String Gender;
	String Aadharcard;
	String Designation;
	Date Joiningdate;
	String ScheduleStartTime;
	String ScheduleEndTime;
	Date BirthDate;
	String Password;
	String MobileNumber;
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAadharcard() {
		return Aadharcard;
	}
	public void setAadharcard(String aadharcard) {
		Aadharcard = aadharcard;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public Date getJoiningdate() {
		return Joiningdate;
	}
	public void setJoiningdate(Date joiningdate) {
		Joiningdate = joiningdate;
	}
	public String getScheduleStartTime() {
		return ScheduleStartTime;
	}
	public void setScheduleStartTime(String scheduleStartTime) {
		ScheduleStartTime = scheduleStartTime;
	}
	public String getScheduleEndTime() {
		return ScheduleEndTime;
	}
	public void setScheduleEndTime(String scheduleEndTime) {
		ScheduleEndTime = scheduleEndTime;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public Employee(String employeeId, String firstName, String middleName, String lastName, String gender,
			String aadharcard, String designation, Date joiningdate, String scheduleStartTime, String scheduleEndTime,
			Date birthDate, String password, String mobileNumber) {
		super();
		EmployeeId = employeeId;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Gender = gender;
		Aadharcard = aadharcard;
		Designation = designation;
		Joiningdate = joiningdate;
		ScheduleStartTime = scheduleStartTime;
		ScheduleEndTime = scheduleEndTime;
		BirthDate = birthDate;
		Password = password;
		MobileNumber = mobileNumber;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	
	
	
	
	
	
}
