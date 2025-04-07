package Exception_Handling_Day17;

public class ExceptionPropagation {
	public static void alpha() {
		System.out.println("Alpha Method");
		beta();
	}
	public static void beta() {
		System.out.println("Beta Method");
		gamma();
	}
	public static void gamma() {
		System.out.println("Gamma Method");
//		System.out.println(10/0); // example of stack tracing of an exception propagation
		try {
			System.out.println(10/0);
			System.out.println("End of Gamma");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception handled");
		}
		System.out.println("End of Gamma");
	}
	public static void main(String[] args) {
		alpha();
		
	}

}
