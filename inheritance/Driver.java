package inheritance;

public class Driver {
	public static void main(String[] args) {
//		Bike b = new Bike("Kawaski", "V4");
//		b.display();
//		System.out.println(b.engineType);
		Car c = new Car("Tata", "V8", 1600);
		System.out.println(c.name + " " + c.engineType + " " + c.hp);
		
//		c.display();
//		System.out.println(c.hp);
	}

}
