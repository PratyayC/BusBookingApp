package com.mindtree.BusBookingApp.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LogIn 
{
	@Id
	String id;
	String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LogIn() 
	{
		
	}
	
	
}