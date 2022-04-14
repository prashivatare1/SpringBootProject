package com.resort.management.Demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resort.management.Demo.dao.RoomDAO;

import com.resort.management.Demo.model.Room;

@RestController
@CrossOrigin
@RequestMapping("/room")
public class RoomRestController {
	@Autowired
	RoomDAO roomDAO;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Room> getAllEmployee() 
	{
		
		return roomDAO.getAllRoom();
		//return roomDAO.getAllRoomId();
	}
	
	@PostMapping(value = "/saveroom",consumes = MediaType.APPLICATION_JSON_VALUE )
	public void saveEnquiry(@RequestBody Room room)
	{
		roomDAO.saveRoom(room);
	}
	
	@GetMapping(value="/count",produces = MediaType.APPLICATION_JSON_VALUE)
	public int getRoomcount() 
	{
		
		return roomDAO.getRoomCount();
	}
	@GetMapping(value="/bookingcount",produces = MediaType.APPLICATION_JSON_VALUE)
	public int getBookingcount() 
	{
		
		return roomDAO.getBookingCount();
	}
	
	

	


}
