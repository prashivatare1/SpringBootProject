package com.resort.management.Demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Counter {

	@Id
	String counterId;
	String intial;
	int nextValue;
	public String getCounterId() {
		return counterId;
	}
	public void setCounterId(String counterId) {
		this.counterId = counterId;
	}
	public String getIntial() {
		return intial;
	}
	public void setIntial(String intial) {
		this.intial = intial;
	}
	public int getNextValue() {
		return nextValue;
	}
	public void setNextValue(int nextValue) {
		this.nextValue = nextValue;
	}
	public Counter(String counterId, String intial, int nextValue) {
		super();
		this.counterId = counterId;
		this.intial = intial;
		this.nextValue = nextValue;
	}
	
	public Counter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int incrementNextValue() 
	{
		return ++nextValue;
	}
	
}
