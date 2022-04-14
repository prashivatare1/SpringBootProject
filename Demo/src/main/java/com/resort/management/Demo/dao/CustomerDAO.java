package com.resort.management.Demo.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.resort.management.Demo.model.Customer;



@Repository
public class CustomerDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Customer> getAllCustomer(){
		try 
		{
			return entityManager.createQuery("FROM Customer", Customer.class).getResultList();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public Collection<Customer> getLoginCustomer(Customer customer)
	{
		try {
			TypedQuery<Customer> query = entityManager.createQuery("SELECT x FROM Customer x WHERE x.EmailId =:mail AND x.Password=:pass",Customer.class);
			
			String mailid =customer.getEmailId();
			String password=customer.getPassword();
			
			List<Customer> logincust =query
					.setParameter("mail", mailid)
					.setParameter("pass", password)
					.getResultList();
			
			//System.out.println(logincust);
					
			
			
			return logincust;
			
			} 
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Transactional
	public void saveCustomer(Customer customer)
	{
		try {
			entityManager.persist(customer);
			
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	



	
	
}
