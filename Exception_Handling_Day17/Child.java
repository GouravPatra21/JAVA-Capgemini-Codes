package Exception_Handling_Day17;

public class Child extends Parent {
//	void demo() throws ArithmeticException {  // if the super class method is throwing an exception then the 
	//subclass overriden method must also throw the same exception or the
	// child type of that exception and not parent type.
//		System.out.println("child");
//	}
	void demo() { //If a parent class throwing an exception the child class need no to throw an exception
		System.out.println("Child");
		
	}
	public static void main(String[] args) {
		
	}
}


