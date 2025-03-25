package inheritance;

public class Parent {
	static int a = 10;
	int b = 20;
	static void print() {
		System.out.println("This is a parent class");
	}
	public void message() {
		System.out.println("This is not a static method");
	}
	static {
		System.out.println("static initializer");
	}
	{
		System.out.println("non static initializer");
	}
	Parent() {
		System.out.println("Parent Constructor");
		
	}

}
