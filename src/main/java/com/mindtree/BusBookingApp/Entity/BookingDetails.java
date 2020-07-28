package com.mindtree.BusBookingApp.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookingDetails 
{
	@Id
	@GeneratedValue
	int id;
	int price;
	String travellerName;
	String destination;
	String source;
	String dateOfTravel;
	String dateOfBooking;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTravellerName() {
		return travellerName;
	}
	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(String dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	public String getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDetails(int id, int price, String travellerName, String destination, String source, String dateOfTravel,
			String dateOfBooking) {
		super();
		this.id = id;
		this.price = price;
		this.travellerName = travellerName;
		this.destination = destination;
		this.source = source;
		this.dateOfTravel = dateOfTravel;
		this.dateOfBooking = dateOfBooking;
	}
	@Override
	public String toString() {
		return "BookingDetails [id=" + id + ", price=" + price + ", travellerName=" + travellerName + ", destination="
				+ destination + ", source=" + source + ", dateOfTravel=" + dateOfTravel + ", dateOfBooking="
				+ dateOfBooking + "]";
	}
	
	
	
}
