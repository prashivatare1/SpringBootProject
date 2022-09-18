package com.resort.management.Demo.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.resort.management.Demo.model.Counter;
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
			
			Counter ctr = entityManager.find(Counter.class, "customer");
			Counter ctrr = entityManager.find(Counter.class, "cust_add");
			
			String cust =ctr.getIntial() + ctr.incrementNextValue();
			String add = ctrr.getIntial() + ctrr.incrementNextValue();
			
			customer.setCustomerId(cust);
			customer.setFirstName(customer.getFirstName());
			customer.setMiddelName(customer.getMiddelName());
			customer.setLastName(customer.getLastName());
			customer.setMobile(customer.getMobile());
			customer.setGender(customer.getGender());
			customer.setEmailId(customer.getEmailId());
			customer.setPassword(customer.getPassword());
			customer.setAddId(add);
			customer.setAddress(customer.getAddress());
			customer.setCity(customer.getCity());
			customer.setZip(customer.getZip());
			
			entityManager.persist(customer);
			
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	



	
	
}
