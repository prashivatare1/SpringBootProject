package com.resort.management.Demo.controller;


import java.sql.Date;
import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resort.management.Demo.dao.BookingDAO;
import com.resort.management.Demo.model.Booking;
import com.resort.management.Demo.model.Roombook;

@RestController
@CrossOrigin
@RequestMapping("/Booking")
public class BookingRestController {

	@Autowired
	BookingDAO bookingDAO;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Booking> getAllBooking() 
	{
		return bookingDAO.getAllBooking();
	}
	
	@PostMapping(value = "/BookingDate",consumes = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Booking> getBookingDates(@RequestBody Date cdate) 
	{
		//System.out.println("Called");
		return bookingDAO.getRoomBooking(cdate);
	}
}
