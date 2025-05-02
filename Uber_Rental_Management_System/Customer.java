package Uber_Rental_Management_System;
//Represents a Customer class who can book rides
public class Customer extends User { //Extends the abstract User Class
	Customer(String id, String name) {
		super(id, name);
	}

	@Override
	public void showProfile() {
		// TODO Auto-generated method stub
		System.out.println("Customer's name: " + name);
		
	}
	

}
