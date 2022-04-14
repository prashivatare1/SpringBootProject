package com.resort.management.Demo.dao;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.resort.management.Demo.model.Room;
import com.resort.management.Demo.model.Roombook;

@Repository
public class RoombookDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Roombook> checkAvailability(Roombook roombook)
	{
		try {
			
			
			TypedQuery<Roombook> query =entityManager.createQuery("SELECT y.id FROM ROOM y EXCEPT SELECT DISTINCT x FROM ROOMBOOK x where :cdate BETWEEN y.checkin and y.checkout",Roombook.class);
			Date cdate =roombook.getCheckin();
			
			List<Roombook> roomlist=query.setParameter("cdate", cdate)
					.getResultList();
			
			return roomlist;
			
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	

}
