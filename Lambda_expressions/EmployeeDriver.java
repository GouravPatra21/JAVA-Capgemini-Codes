package Lambda_expressions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> em = new ArrayList<>();
		
		em.add(new Employee(3, "Subhajit"));
		em.add(new Employee(2, "Gourav"));
		em.add(new Employee(1, "Kaustav"));
		em.add(new Employee(4, "Debayan"));
		//sort by id
		Collections.sort(em);
		System.out.println(em);
		//sort by name
		Comparator c = (o1, o2) -> ((Employee)o1).name.compareTo(((Employee)o2).name);
		Collections.sort(em, c);
		System.out.println(em);
		
		
		
		
	}

}
