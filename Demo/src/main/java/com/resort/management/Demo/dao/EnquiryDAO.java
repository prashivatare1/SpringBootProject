package com.resort.management.Demo.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.resort.management.Demo.model.Counter;
import com.resort.management.Demo.model.Enquiry;

@Repository
public class EnquiryDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Enquiry> getAllEnquiries(){
		try {
			return entityManager.createQuery("FROM Enquiry" , Enquiry.class).getResultList();
			
		} catch (Exception e) {
				throw new RuntimeException(e);
		}
	}
	
	@Transactional
	public void saveEnquiry(Enquiry enquiry){
		try {
			Counter ctr =entityManager.find(Counter.class,"enquiry");
			String intial =ctr.getIntial() + ctr.incrementNextValue();
			
			enquiry.setEnqId(intial);
			enquiry.setName(enquiry.getName());
			enquiry.setContact(enquiry.getContact());
			enquiry.setEmail(enquiry.getEmail());
			enquiry.setMessage(enquiry.getMessage());
			enquiry.setEnqDate(enquiry.getEnqDate());
			entityManager.persist(enquiry);
		} catch (Exception e) {
				throw new RuntimeException(e);
		}
	}
	
	public Enquiry getEnquirybyId(String id) 
	{
		Enquiry enquiry = entityManager.find(Enquiry.class,id);
		return enquiry;
	} 

}
