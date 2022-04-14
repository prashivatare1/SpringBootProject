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
	String RoomId;
	String CustomerId;
	Date checkin;
	Date checkout;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(String bookingId, String roomId, String customerId, Date checkin, Date checkout) {
		super();
		BookingId = bookingId;
		RoomId = roomId;
		CustomerId = customerId;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	@Id
	public String getBookingId() {
		return BookingId;
	}
	public void setBookingId(String bookingId) {
		BookingId = bookingId;
	}
	public String getRoomId() {
		return RoomId;
	}
	public void setRoomId(String roomId) {
		RoomId = roomId;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	
}
