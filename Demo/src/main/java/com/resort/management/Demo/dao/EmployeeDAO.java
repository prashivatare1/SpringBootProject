package com.resort.management.Demo.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.resort.management.Demo.model.Counter;
import com.resort.management.Demo.model.Employee;

@Repository
public class EmployeeDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Employee> getAllEmployee()
	{
		try 
		{
			return entityManager.createQuery("FROM Employee",Employee.class).getResultList();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	@Transactional
	public void saveEmployee(Employee employee)
	{
		try {
			
			Counter ctr =entityManager.find(Counter.class, "employee");
			
			String empid =ctr.getIntial()+ctr.incrementNextValue();
			employee.setEmployeeId(empid);
			employee.setFirstName(employee.getFirstName());
			employee.setMiddleName(employee.getMiddleName());
			employee.setLastName(employee.getLastName());
			employee.setGender(employee.getGender());
			employee.setAadharcard(employee.getAadharcard());
			employee.setMobileNumber(employee.getMobileNumber());
			employee.setDesignation(employee.getDesignation());
			employee.setScheduleStartTime(employee.getScheduleStartTime());
			employee.setScheduleEndTime(employee.getScheduleEndTime());
			employee.setBirthDate(employee.getBirthDate());
			employee.setPassword(employee.getPassword());
		
			entityManager.persist(employee);
			
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}
