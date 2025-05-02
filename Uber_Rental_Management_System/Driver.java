package Uber_Rental_Management_System;
//Represent a driver class who checks the availability status of driver to provide rides
public class Driver extends User { //Extends the Abstract User Class
	private boolean available;
	Driver(String id, String name, boolean available) {
		super(id, name);
		this.available = true;
	}
	//To check the availability of driver
	//@return true if available, otherwise if not available returns false 
	public boolean isAvailable() {
		return available;
	}
	
	/**
	 * 	Set Driver availability status through this method
	 */
	public void setAvailable(boolean available) {
		this.available = available; // to set the value of availability of driver either true or false
	}
	@Override
	public void showProfile() {
		// TODO Auto-generated method stub
		System.out.println("Driver's name: " + name + " " +"Availability: " + (available ? "Avaialable" : "Not Available"));
	}

}
