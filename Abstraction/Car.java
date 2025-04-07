package Abstraction;

public class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Electric engine Start");
		
	}
	@Override
	public void message() {
		System.out.println("Have a Car ride");
		
	}

}
