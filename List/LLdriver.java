package List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
public class LLdriver {
	public static void main(String[] args) {
		LinkedList<Student> ll = new LinkedList();
		ll.add(new Student(41, "Gourav"));
		ll.add(new Student(25, "Debayan"));
		ll.add(new Student(31, "Kaustav"));
		System.out.println(ll);
		
		System.out.println("Sorted as per Id");
		Collections.sort(ll);
		System.out.println(ll);
		
		System.out.println("Sorted as per Name");
		Collections.sort(ll, new StudentsCompareByName());
		System.out.println(ll);
		
		System.out.println("----------------------");
		
		ll.addFirst(new Student(65, "Rohit"));
		ll.addLast(new Student(36, "Anirban"));
		System.out.println(ll);
		
		System.out.println("-----------------------");
		Iterator<Student> itr = ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------------------------");
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll);
   }

}
