package com.resort.management.Demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Roombook {

	@Id
	String id;
	String roomType;
	String description;
	String adults;
	String price;
	String roomphotos;
	String bookingId;
	String roomId;
	String CustomerId;
	Date checkin;
	Date checkout;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAdults() {
		return adults;
	}
	public void setAdults(String adults) {
		this.adults = adults;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRoomphotos() {
		return roomphotos;
	}
	public void setRoomphotos(String roomphotos) {
		this.roomphotos = roomphotos;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
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
	
	public Roombook(String id, String roomType, String description, String adults, String price, String roomphotos,
			String bookingId, String roomId, String customerId, Date checkin, Date checkout) {
		super();
		this.id = id;
		this.roomType = roomType;
		this.description = description;
		this.adults = adults;
		this.price = price;
		this.roomphotos = roomphotos;
		this.bookingId = bookingId;
		this.roomId = roomId;
		CustomerId = customerId;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public Roombook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
