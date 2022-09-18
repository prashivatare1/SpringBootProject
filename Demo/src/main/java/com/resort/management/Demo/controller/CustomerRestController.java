package com.resort.management.Demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resort.management.Demo.dao.CustomerDAO;
import com.resort.management.Demo.model.Customer;

import InterfacesControl.CustomerRepository;


@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerRestController {
	@Autowired
	CustomerDAO customerDAO;
	
	//@Autowired
	//CustomerRepository custRepo;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Customer> getAllCustomer() 
	{
		
		return customerDAO.getAllCustomer();
	}
	
	@PostMapping(value = "/savecustomer",consumes = MediaType.APPLICATION_JSON_VALUE )
	public void saveCustomer(@RequestBody Customer customer)
	{
		customerDAO.saveCustomer(customer);
	}
	
	@PostMapping(value = "/logincustomer",consumes = MediaType.APPLICATION_JSON_VALUE )
	public Collection<Customer> saveLoginCustomer(@RequestBody Customer customer)
	{
		System.out.println("CustId:"+customer.getEmailId());
		return customerDAO.getLoginCustomer(customer);
		
		
	}

}
