package com.resort.management.Demo.dao;

import java.sql.Date;
import java.util.Collection;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resort.management.Demo.model.Booking;
import com.resort.management.Demo.model.Counter;
import com.resort.management.Demo.model.Enquiry;

@Repository
public class BookingDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Booking> getAllBooking()
	{
		try 
		{
		
				return entityManager.createQuery("FROM Booking",Booking.class).getResultList();
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
	
	@Transactional
	public void saveBooking(Booking booking){
		try {
			Counter ctr =entityManager.find(Counter.class,"booking");
			String intial =ctr.getIntial() + ctr.incrementNextValue();
			
			booking.setBookingId(intial);
			booking.setId(booking.getId());
			booking.setCustomerId(booking.getCustomerId());
			booking.setCheckin(booking.getCheckin());
			booking.setCheckout(booking.getCheckout());
			booking.setCost(booking.getCost());
			
			
			entityManager.persist(booking);
		} catch (Exception e) {
				throw new RuntimeException(e);
		}
	}
	
	
	
}
