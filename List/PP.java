package List;

import java.util.Vector;

public class PP {
	public static void main(String[] args) {
		   Vector<String> names = new Vector<>();

	        // Adding elements
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");

	        // Accessing elements
	        System.out.println("First element: " + names.get(0));

	        for (String string : names) {
				System.out.println(string);
			}
	        
	        System.out.println(names.remove("Alice"));
	        
	        System.out.println(names);
	}
}
