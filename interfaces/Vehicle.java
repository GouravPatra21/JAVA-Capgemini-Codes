package interfaces;

public interface Vehicle {
	int speed = 10;
	void print();
	void start();
	
	static void utility() {
		System.out.println("This is a utuility static method");
	}
	public static void main(String[] args) {
		utility();
	}
	default void text() {
		System.out.println("This is a default method");
	}

}
