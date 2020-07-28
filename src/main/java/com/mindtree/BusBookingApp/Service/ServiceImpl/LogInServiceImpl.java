package com.mindtree.BusBookingApp.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.mindtree.BusBookingApp.Entity.LogIn;
import com.mindtree.BusBookingApp.Exceptions.NoRecordsFoundException;
import com.mindtree.BusBookingApp.Repistory.LogInRepository;
import com.mindtree.BusBookingApp.Service.LogInService;
@Service
public class LogInServiceImpl implements LogInService 
{
	@Autowired
	LogInRepository loginRep;
	@Override
	public void addLogInDetails(LogIn login) 
	{
		loginRep.save(login);
	}
	@Override
	public String checkUser(String id,String password) throws NoRecordsFoundException 
	{
		
		Optional<LogIn>log=loginRep.findByPassword(id,password);
		log.orElseThrow(()->new NoRecordsFoundException("USER NOT REGISTERED!"));
		return "";
	}
	
}
