package com.resort.management.Demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Checkdate {

	@Id
	int cid;
	Date cdate;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	public Checkdate(int cid, Date cdate) {
		super();
		this.cid = cid;
		this.cdate = cdate;
	}
	
	public Checkdate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
