package com.resort.management.Demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Room {
	@Id
	String id;
	String RoomType;
	String Description ;
	int Adluts;
	int child;
	int price;
	String roomPhotos;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getAdluts() {
		return Adluts;
	}
	public void setAdluts(int adluts) {
		Adluts = adluts;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRoomPhotos() {
		return roomPhotos;
	}
	public void setRoomPhotos(String roomPhotos) {
		this.roomPhotos = roomPhotos;
	}
	
	public Room(String id, String roomType, String description, int adluts, int child, int price, String roomPhotos) {
		super();
		this.id = id;
		RoomType = roomType;
		Description = description;
		Adluts = adluts;
		this.child = child;
		this.price = price;
		this.roomPhotos = roomPhotos;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
		
}
