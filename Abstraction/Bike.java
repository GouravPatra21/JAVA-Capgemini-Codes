package Abstraction;

public class Bike extends Vehicle {
	@Override
	public void start() {
		System.out.println("Bike engine starts");
		
	}
	@Override
	public void message() {
		System.out.println("Have a nice ride");
		
	}

}
