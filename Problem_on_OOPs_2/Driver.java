package Problem_on_OOPs_2;

public class Driver {
	public static void main(String[] args) {
		Bike b = new Bike("WB 01 A 0021", "Kawsaki", "Z900", 3000, true, true);
		b.displayDetails();
		
		Car c = new Car("WB 01 A 2003", "BMW", "Z900", 3000, true, 4);
		c.displayDetails();
		
	}

}
