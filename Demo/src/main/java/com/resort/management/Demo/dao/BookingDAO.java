package com.resort.management.Demo.dao;

import java.sql.Date;
import java.util.Collection;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resort.management.Demo.model.Booking;

@Repository
public class BookingDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Booking> getAllBooking()
	{
		try 
		{
		
				return entityManager.createQuery("SELECT x FROM Booking x WHERE '7-APR-2022' NOT BETWEEN x.checkin AND x.checkout",Booking.class).getResultList();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	
	
	public Collection<Booking> getRoomBooking( @Param("cdate")Date cdate)
	{
		try
		{
		return entityManager.createQuery("SELECT x FROM Booking x WHERE :cdate NOT BETWEEN x.checkin AND x.checkout,Booking" ,Booking.class).getResultList();
		}
		catch(Exception e) 
		{
			throw new RuntimeException(e);
		}
	}
}
