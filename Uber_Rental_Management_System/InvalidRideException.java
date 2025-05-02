package Uber_Rental_Management_System;
/**
 * Creating a Custom Exception for invalid Ride operations  by 
 * extending RuntimeException
 */
public class InvalidRideException extends RuntimeException {
	/**
	 * Creating a Constructor for the Error message
	 *  of the Custom Exception
	 */
	InvalidRideException(String message) {
		super(message);
	}

}
