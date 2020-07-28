package com.mindtree.BusBookingApp.Service.ServiceImpl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.BusBookingApp.Entity.BookingDetails;
import com.mindtree.BusBookingApp.Exceptions.DestinationNotFoundExceptions;
import com.mindtree.BusBookingApp.Exceptions.NoRecordsFoundException;
import com.mindtree.BusBookingApp.Exceptions.ServiceExceptions;
import com.mindtree.BusBookingApp.Exceptions.SourceNotFoundException;
import com.mindtree.BusBookingApp.Repistory.BookingRepository;
import com.mindtree.BusBookingApp.Service.BookingDetailsService;

@Service 
public class BookingDetialsServiceImpl implements BookingDetailsService 
{
	@Autowired
	BookingRepository bookingRepository;

	@Override
	public String addBookingDetails(BookingDetails bookingDetails) 
	{
		String msg="Successfully Added";
		bookingRepository.save(bookingDetails);
		return msg;
	}

	@Override
	public List<BookingDetails> getDetails() throws ServiceExceptions 
	{
		List<BookingDetails> li=bookingRepository.findAll();
		
		Collections.sort(li,((c1,c2)->c2.getDateOfTravel().toString().compareTo(c1.getDateOfTravel().toString())));
		try 
		{
			if(li.size()==0)
			{
				throw new NoRecordsFoundException("NO RECORDS FOUND!");
			}
			else 
			{
				return li;
			}
		}
		catch(NoRecordsFoundException e)
		{
			throw new ServiceExceptions(e.getMessage());
		}
		
	}

	@Override
	public List<BookingDetails> searchBySource(String source) throws ServiceExceptions 
	{
		List<BookingDetails> li=bookingRepository.findAll();
		List<BookingDetails> list;
		list=li
				.stream()
				.filter(x1->x1.getSource().equals(source))
				.collect(Collectors.toList());
		
		try 
		{
			if(list.size()==0)
			{
				throw new SourceNotFoundException("NO SOURCE FOUND WITH "+source+" NAME!");
			}
			else 
			{
				return list;
			}
		}
		catch(SourceNotFoundException e)
		{
			throw new ServiceExceptions(e.getMessage());
		}
		 
	}

	@Override
	public List<BookingDetails> searchByDestination(String destination) throws ServiceExceptions 
	{
		List<BookingDetails> li=bookingRepository.findAll();
		List<BookingDetails> list;
		list = li
				.stream()
				.filter(x1->x1.getDestination().equals(destination))
				.collect(Collectors.toList());
		try 
		{
			if(list.size()==0)
			{
				throw new DestinationNotFoundExceptions("NO DESTINATION FOUND WITH "+destination+" NAME!");
			}
			else 
			{
				return list;
			}
		}
		catch(DestinationNotFoundExceptions e)
		{
			throw new ServiceExceptions(e.getMessage());
		}
	}

	@Override
	public void deleteBookingDetails(int id) 
	{
		bookingRepository.deleteById(id);
	}

}
