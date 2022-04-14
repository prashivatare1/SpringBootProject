package com.resort.management.Demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resort.management.Demo.dao.RoombookDAO;
import com.resort.management.Demo.model.Roombook;

@RestController
@CrossOrigin
@RequestMapping("/checkavail")
public class RoomBookController {
	
	@Autowired
	RoombookDAO roombookDAO;
	
	
	@PostMapping(value ="/date" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Roombook> getNonBookedRooms(@RequestBody Roombook room)
	{
		return roombookDAO.checkAvailability(room);
		
	}

}
