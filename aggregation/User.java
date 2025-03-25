package aggregation;

public class User {
	public static void main(String[] args) {
		Customer c = new Customer("Gourav Patra");
		Bank b = new Bank("Bandhan Bank", c);
		b.display();
	}

}
