package Problem_on_OOPs_2;

public class Car extends Vehicle {
	private int numberofDoors;
	public Car(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, int numberofDoors ) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.numberofDoors = numberofDoors;
		
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println(" " + this.numberofDoors);
		super.rentVehicle();
	}

}
