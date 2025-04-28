package HashSet;
import java.util.HashSet;
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add(10);
		hs.add(11.26);
		hs.add(25);
		hs.add(85);
		hs.add("hello");
		hs.add(null);
		hs.add(null);
		hs.add(85);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains(85));
		
	}

}
