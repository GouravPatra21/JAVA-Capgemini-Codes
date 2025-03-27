package Problem_on_OOPs_2;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable) {
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
		this.isAvailable = isAvailable;
	}
	public void displayDetails() {
		System.out.print(this.vehicleNumber + " " + this.brand + " " + this.model + " " + this.rentalPricePerDay + " " + this.isAvailable);
	}
	public void rentVehicle() {
		if(!isAvailable) {
			System.out.println("Vehicle cannot be rented");
		}
		else {
			System.out.println("Vehicle can be rented");
		}
	}

}
