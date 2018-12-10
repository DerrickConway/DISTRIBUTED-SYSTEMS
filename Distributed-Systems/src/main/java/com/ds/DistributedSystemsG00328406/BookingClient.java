package com.ds.DistributedSystemsG00328406;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BookingClient
{

	public static void main(String[] args) throws NotBoundException
	{
		try 
		{
			// get the regist	
			Registry registry = LocateRegistry.getRegistry(null);
			
			// try looking up regist remote object
			BookingServiceInterface stub = (BookingServiceInterface) registry.lookup("databaseService");
			
			// method
			stub.getBooking(0);				
		}
		
		catch (RemoteException e) 
		{	//print exception
			System.out.println("Exception: " + e);
		}
	}
	
}
