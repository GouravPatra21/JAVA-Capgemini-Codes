package interfaces;

public interface C extends A,B {
	default void check() {
		System.out.println(A.a);
//      message();  //static methods are not inherited
		A.message();
		B.message();
		print();
	}
	@Override
	default void print() {
		A.super.print();
		System.out.println("hola");
	}
	
	// *if we create another default method with same name as parent then the
	// compiler does not throw any error as the new default method will be
	// belonging to type C and both default methods from type A and B will be
	// shadowed.
	
//	default void print() {
//		System.out.println("hola");
//	}
	public static void main(String[] args) {
//		this.check(); // you cannot access a default message in static context in an a interface
	}

}
