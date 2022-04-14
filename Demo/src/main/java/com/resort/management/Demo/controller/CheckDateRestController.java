package com.resort.management.Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resort.management.Demo.dao.CheckDateDAO;
import com.resort.management.Demo.model.Checkdate;



@RestController
@CrossOrigin
@RequestMapping("/checkdate")
public class CheckDateRestController {
	
	@Autowired
	CheckDateDAO checkDatedao;
	
	@GetMapping(value="/display",produces = MediaType.APPLICATION_JSON_VALUE)
	public String DisplayValue()
	{
		return "HEllo";
	}
	@PostMapping(value = "/display",consumes = MediaType.APPLICATION_JSON_VALUE )
	public void saveEnquiry(@RequestBody Checkdate checkdate)
	{
		checkDatedao.saveCheckdate(checkdate);
	}

	
	

}
