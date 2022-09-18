package com.resort.management.Demo.model;



import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Booking implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	String BookingId;
	String Id;
	String CustomerId;
	String checkin;
	String checkout;
	Long cost;
	
	public String getBookingId() {
		return BookingId;
	}
	@Id
	public void setBookingId(String bookingId) {
		BookingId = bookingId;
	}
	@Override
	public String toString() {
		return "Booking [BookingId=" + BookingId + ", Id=" + Id + ", CustomerId=" + CustomerId + ", checkin=" + checkin
				+ ", checkout=" + checkout + ", cost=" + cost + "]";
	}
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Booking(String bookingId, String id, String customerId, String checkin, String checkout, Long cost) {
		super();
		BookingId = bookingId;
		Id = id;
		CustomerId = customerId;
		this.checkin = checkin;
		this.checkout = checkout;
		this.cost = cost;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
	
	
}
