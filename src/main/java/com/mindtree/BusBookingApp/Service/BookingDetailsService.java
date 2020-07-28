package com.mindtree.BusBookingApp.Service;

import java.util.List;

import com.mindtree.BusBookingApp.Entity.BookingDetails;
import com.mindtree.BusBookingApp.Exceptions.ServiceExceptions;

public interface BookingDetailsService 
{
	public String addBookingDetails(BookingDetails bookingDetails);
	public List<BookingDetails> getDetails() throws ServiceExceptions ;
	public List<BookingDetails>searchBySource(String source)throws ServiceExceptions;
	public List<BookingDetails>searchByDestination(String destination) throws ServiceExceptions;
	public void deleteBookingDetails(int id);
}
