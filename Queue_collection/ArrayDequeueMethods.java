package Queue_collection;
import java.util.ArrayDeque;
public class ArrayDequeueMethods {
	public static void main(String[] args) {
		ArrayDeque aq = new ArrayDeque();
		aq.add(15);
		aq.add(69);
//		aq.add(null);
		aq.add("Gourav");
		aq.add(15.6);
		aq.add('v');
		aq.add(69);
		System.out.println(aq);
		System.out.println(aq.element());
		System.out.println(aq.getFirst());
		System.out.println(aq.getLast());
		System.out.println(aq.peek());
		System.out.println(aq.pollFirst());
		System.out.println(aq.pollLast());
		System.out.println(aq.pop());
		System.out.println(aq.remove());
	
	}

}
