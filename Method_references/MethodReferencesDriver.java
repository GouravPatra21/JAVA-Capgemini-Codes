package Method_references;

public class MethodReferencesDriver {
	public static void main(String[] args) {
		Demo d = System.out::println;
		d.print("Hello World");
		System.out.println("--------------------------------");
		//referring a non-static method to target functional interface
		MethodReferencesDriver driver = new MethodReferencesDriver();
		Test t = driver::print;
		t.greet(5, "Welcome");
		System.out.println("--------------------------------");
		//referring a static method to target functional interface
		Table table = MethodReferencesDriver::printTable;
		table.printTable(5);
	}
	
	public void print(int number, String message) {
		for (int i = 0; i < number; i++) {
			System.out.println(message);
		}
	}
	public static void printTable(int x) {
		for(int i = 1; i <= x; i++) {
			System.out.println(i*x);
		}
	}


}
