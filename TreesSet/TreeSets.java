package TreesSet;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSets {
	public static void main(String[] args) {
		TreeSet<Employee> tt = new TreeSet<>();
//		tt.add(null);
//		tt.add(21);
//		tt.add(50);
//		tt.add(5);
//		tt.add(99);
//		tt.add("Gourav");
//		tt.add('f');
		//Compare By Salary
		tt.add(new Employee("Kaustav", 50000));
		tt.add(new Employee("Debayan", 45000));
		tt.add(new Employee("Gourav", 40000));
		tt.add(new Employee("Anirban", 55000));
		System.out.println(tt);
		System.out.println(tt.reversed());
		//Compare By Name
		TreeSet<Employee> ts = new TreeSet<>(new CompareByName());
		ts.add(new Employee("Kaustav", 50000));
		ts.add(new Employee("Debayan", 45000));
		ts.add(new Employee("Gourav", 40000));
		ts.add(new Employee("Anirban", 55000));
		Iterator<Employee> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
