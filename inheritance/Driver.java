package inheritance;

public class Driver {
	public static void main(String[] args) {
		Bike b = new Bike("Kawaski", "V4");
		b.display();
		System.out.println(b.engineType);
		Car c = new Car("BMW", "V8", 25000000);
		
		c.display();
		System.out.println(c.price);
	}

}
