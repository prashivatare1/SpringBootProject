package com.resort.management.Demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.resort.management.Demo.model.Counter;
import com.resort.management.Demo.model.Room;

@Repository
public class RoomDAO {
	int abc;
@PersistenceContext
EntityManager entityManager;

public Collection<Room> getAllRoom()
{
	try 
	{
		return entityManager.createQuery("FROM Room",Room.class).getResultList();
	}
	catch(Exception e)
	{
		throw new RuntimeException(e);
	}
}

public int getRoomCount()
{

try 
{
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost/xe", "pradyumna", "Prashivatare");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select count(id) from room");
	while(rs.next())
	abc= rs.getInt(1);
	rs.close();
	return abc;
}
catch(Exception e)	
{
	throw new RuntimeException(e);
}
}

public int getBookingCount()
{

try 
{
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost/xe", "pradyumna", "Prashivatare");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select count(bookingid) from booking");
	while(rs.next())
	abc= rs.getInt(1);
	rs.close();
	return abc;
}
catch(Exception e)	
{
	throw new RuntimeException(e);
}
}




@Transactional
public void saveRoom(Room room)
{
	try {
		Counter ctr =entityManager.find(Counter.class, "room");
		String cust =ctr.getIntial() +  ctr.incrementNextValue();
		
		room.setId(cust);
		room.setRoomType(room.getRoomType());
		room.setDescription(room.getDescription());
		room.setChild(room.getChild());
		room.setAdluts(room.getAdluts());
		room.setPrice(room.getPrice());
		room.setRoomPhotos(room.getRoomPhotos());
		entityManager.persist(room);
		
	}
	catch(Exception e)
	{
		throw new RuntimeException(e);
	}
}
}
