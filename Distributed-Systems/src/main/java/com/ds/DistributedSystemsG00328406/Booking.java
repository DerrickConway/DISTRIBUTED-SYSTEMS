package com.ds.DistributedSystemsG00328406;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Booking 
{
	// creating variables
	private String fName;
	private String lName;
	private double prise;
	private int orderID;
	private String carName;
	private String reg;
	
	// getter and setters for the variables
	public String getFirstName() {
		return fName;
	}
	public void setFirstName(String firstName) {
		this.fName = firstName;
	}
	public String getLastName() {
		return lName;
	}
	public void setLastName(String lastName) {
		this.lName = lastName;
	}
	public double getOrderPrise() {
		return prise;
	}
	public void setOrderPrise(double prise) {
		this.prise = prise;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarReg() {
		return reg;
	}
	public void setCarReg(String carReg) {
		this.reg = carReg;
	}
	
	@Override
	public String toString() {
		return "Booking [firstName=" + fName + ", lastName=" + lName + ", orderCost=" + prise + ", orderID="
				+ orderID + ", carName=" + carName + ", carRegistration=" + reg + "]";
	}
	
	
	

}
