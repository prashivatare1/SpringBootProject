package com.resort.management.Demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resort.management.Demo.dao.EnquiryDAO;
import com.resort.management.Demo.model.Enquiry;

@RestController
@CrossOrigin
@RequestMapping("/enquiry")
public class EnquiryRestController {

	@Autowired
	EnquiryDAO enquirydao;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Enquiry> getAllEnquiries()
	{
		return enquirydao.getAllEnquiries();
	}
	
	@PostMapping(value ="/saveenquiry", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveEnquiry(@RequestBody Enquiry enquiry)  
	{
		enquirydao.saveEnquiry(enquiry);
		
	}
	
	@GetMapping(value="/findbyname/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Enquiry getProductName(@PathVariable("id") String prodid)
	{
		return enquirydao.getEnquirybyId(prodid);
		 
	}
}
