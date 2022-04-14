package com.resort.management.Demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ENQUIRY" )
public class Enquiry implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ENQID")
	String enqId;
	
	@Column(name = "NAME")
	String name;
	@Column(name = "EMAIL")
	String email;
	@Column(name = "CONTACT")
	String contact;
	@Column(name = "MESSAGE")
	String message;
	@Column(name = "ENQDATE")
	String enqDate;
	
	public Enquiry(String enqId, String name, String email, String contact, String message, String enqDate) {
		super();
		this.enqId = enqId;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.message = message;
		this.enqDate = enqDate;
	}
	public Enquiry() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getEnqId() {
		return enqId;
	}
	public void setEnqId(String enqId) {
		this.enqId = enqId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEnqDate() {
		return enqDate;
	}
	public void setEnqDate(String enqDate) {
		this.enqDate = enqDate;
	}
	@Override
	public String toString() {
		return "Enquiry [enqId=" + enqId + ", name=" + name + ", email=" + email + ", contact=" + contact + ", message="
				+ message + ", enqDate=" + enqDate + "]";
	}
	
	

	
	
	
	

}
