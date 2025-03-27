package inheritance;

public class Bike extends Vehicle{
	public Bike(String name, String engineType) {
//		this.name = name;
//		this.engineType = type;
		super(name, engineType);
		System.out.println("Bike Constructor");
				
	}

}
