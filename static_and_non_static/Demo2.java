package static_and_non_static;

public class Demo2 {
	public Demo2() {
//		System.out.println(Demo1.id);   ---->>we cannot mate a static reference to the non static field
		
		Demo1 d = new Demo1();
		System.out.println(d.id);
		System.out.println(d.name);
		
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
	}
	

}
