package com.mindtree.BusBookingApp.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.BusBookingApp.Entity.User;
import com.mindtree.BusBookingApp.Repistory.UserRepository;
import com.mindtree.BusBookingApp.Service.UserService;
@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	UserRepository userRepository;

	@Override
	public String addUser(User user) 
	{
		userRepository.save(user);
		return "added user";
	}

}
