package com.mindtree.BusBookingApp.Repistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.BusBookingApp.Entity.BookingDetails;
@Repository
public interface BookingRepository extends JpaRepository<BookingDetails, Integer> 
{
	
}
