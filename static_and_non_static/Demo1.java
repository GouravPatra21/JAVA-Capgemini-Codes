package static_and_non_static;

public class Demo1 {
		int id = 1;
		static String name= "Raj";
		public Demo1() { //non-static context
			System.out.println(id);
			System.out.println(name);
			
		}
		public static void main(String[] args) {
			Demo1 d = new Demo1();
			System.out.println(d.id);
			System.out.println(d.name);
		}

	}


