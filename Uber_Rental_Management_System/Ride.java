package Uber_Rental_Management_System;
/**
 * A Ride class is created to check the status of the Ride either it
 * is booked or not and to confirm a ride between the Customer and the 
 * Driver
 */
public class Ride {
	private Customer customer;
	private Driver driver;
	private String status;
	
	Ride(Customer customer, Driver driver) {
		this.customer = customer;
		this.driver = driver;
		this.status = "Booked";
		this.driver.setAvailable(false); // When the status of ride is 
		//that means that the driver is not available so the method
		//setAvailable for driver is false
	}
	
	/**
	 * A method is created to set the status of the ride to Completed
	 */
	public void completeRide() {
		this.status = "Completed";
		this.driver.setAvailable(true); // the value of setAvailable is 
		// made true so that the driver is available for the next ride
	}
	/**
	 * A method is created to check the status of the ride
	 * @return the status of the ride
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * A method is created to provide the rideDetails of the
	 * Customer and Driver
	 */
	public String rideDetails() {
		return "Customer Name: " + this.customer.name + " " + "Driver's Name: " + this.driver.name + " " + "Current Status: " + status;
	}

}
