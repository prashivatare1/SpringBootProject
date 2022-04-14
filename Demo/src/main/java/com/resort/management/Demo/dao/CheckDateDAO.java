package com.resort.management.Demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.resort.management.Demo.model.Checkdate;


@Repository
public class CheckDateDAO {
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void saveCheckdate(Checkdate cdate ) 
	{
		try 
		{
			entityManager.persist(cdate);
			
		}
		catch(Exception e) 
		{
			throw new RuntimeException(e);
		}
		
	}

}
