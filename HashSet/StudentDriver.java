package HashSet;
import java.util.HashSet;
public class StudentDriver {
	public static void main(String[] args) {
		HashSet<Student> h = new HashSet();
		h.add(new Student(1, "Kaustav"));
		h.add(new Student(25, "Gourav"));
		h.add(new Student(19, "Debayan"));
		h.add(new Student(48, "Anirban"));
		h.add(new Student(1, "Kaustav"));
		System.out.println(h);
		
		
	}

}
