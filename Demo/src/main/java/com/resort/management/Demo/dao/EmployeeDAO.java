package com.resort.management.Demo.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

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
			entityManager.persist(employee);
			
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}
