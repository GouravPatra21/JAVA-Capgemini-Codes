package Uber_Rental_Management_System;

public abstract class User {
	protected String id;
	protected String name;
	User(String id, String name) {
		this.id = id;
		this.name = name;
	}
	//Abstract Method to display user profile
	//Must be implemented by Subclasses
	public abstract void showProfile();
	
	//Getter for Id 
//	public String getId() {
//		return id;
//	}
	//Getter for Name
//	public String getName() {
//		return name;
//	}

}
