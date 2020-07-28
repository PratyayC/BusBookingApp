package com.mindtree.BusBookingApp.Service;

import com.mindtree.BusBookingApp.Entity.LogIn;
import com.mindtree.BusBookingApp.Entity.User;
import com.mindtree.BusBookingApp.Exceptions.NoRecordsFoundException;

public interface LogInService 
{
	void addLogInDetails(LogIn login);
	public String checkUser(String id, String password) throws NoRecordsFoundException ;

}
