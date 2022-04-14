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

import com.resort.management.Demo.dao.EmployeeDAO;
import com.resort.management.Demo.model.Employee;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	EmployeeDAO employeeDAO;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Employee> getAllEmployee() 
	{
		
		return employeeDAO.getAllEmployee();
	}
	
	
	@PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE )
	public void saveEnquiry(@RequestBody Employee employee)
	{
		employeeDAO.saveEmployee(employee);
	}

}
