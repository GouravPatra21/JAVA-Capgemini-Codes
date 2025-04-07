package wrapper_class;

public class WrapperClasses {
	public static void main(String[] args) {
		int i = 10;
		Integer x = new Integer(i); // boxing
		System.out.println("x: " + x);
		int z = Integer.valueOf(x); //auto unboxing
		System.out.println(z);
		
		Integer y = i; // autoboxing
		System.out.println("y: " + y);
		
		int a = y.intValue(); //unboxing
		Boolean flag = true;
		boolean b =flag.booleanValue(); //unboxing
		System.out.println("a: " +a+" "+"b: "+b);
		
		Character ch = 'a'; //auto-boxing
		char c = ch; //auto-unboxing
		
		Integer i1 = 128;
		Integer j = 128;
		System.out.println(i1==j);
		
		String s = "true";
		Boolean b1 = Boolean.parseBoolean(s);
		boolean b2 = Boolean.parseBoolean(s);
		System.out.println(b1); //prints value as non primitive type
		System.out.println(b2); //prints value as primitive type
		
	}

}
