package com.ds.DistributedSystemsG00328406;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

@Path("BookingSystem")
public class BookingResource
{
	// Variables
	private BookingServiceImpl bookingServiceImpl;

	public BookingResource() throws SQLException, RemoteException
	{
		bookingServiceImpl = new BookingServiceImpl();
	}
		
	// Shows bookings
	@GET
	@Path("showAllBookings")
	@Produces(MediaType.APPLICATION_XML)
	public List<Booking> getBookings() 
	{
		System.out.println("getBookings!");
		return bookingServiceImpl.getBookings();
	}
	
	// Creates a booking
	@POST
	@Path("createBooking")
	public Booking createBooking(Booking booking1)
	{
		try
		{
			bookingServiceImpl.createBooking(booking1);
		} 
		catch (RemoteException e)
		{
			System.out.println("Resource Error: " + e);
		}
		
		// Return the createdBooking
		return booking1;
	}
	
	// bookings with a ID
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("booking/{orderID}")
	public Booking getBooking1(@PathParam("orderID") int orderID) 
	{
		try
		{
			return bookingServiceImpl.getBooking(orderID);
		} 
		catch (RemoteException e)
		{
			System.out.println("Error: " + e);
		}
		return null;
	}
	
	
	@DELETE //delete booking
	@Produces(MediaType.APPLICATION_XML)
	@Path("booking/{orderID}")//use path delete booking by orderID
	public Booking getBooking(@PathParam("orderID") int orderID) 
	{
		try
		{	//
			return bookingServiceImpl.getBooking(orderID);
		} 
		catch (RemoteException e)
		{		//throw error
			System.out.println("Error: " + e);
		}
		return null;
	}
	
}


