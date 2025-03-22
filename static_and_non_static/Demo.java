package static_and_non_static;

public class Demo {
	static {
		System.out.println("1st multiline static initializer");
		
	}
	static {
		System.out.println("2nd multiline static initializer");
		
	}
//	static {
//		System.out.println("3rd multiline static initializer");
//		
//	}
	public Demo() {
		System.out.println("Constructor");
	}
	{
		System.out.println("1st non static Initializer");
	}
	{
		System.out.println("2nd non static Initializer");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Demo d1 = new Demo();
	}

}
