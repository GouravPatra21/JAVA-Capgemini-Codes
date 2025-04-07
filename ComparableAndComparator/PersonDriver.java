package ComparableAndComparator;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1 = new Person("Gourav", 22);
		Person p2 = new Person("Gourav", 23);
		
		
	}
	public static void compareBasedOnName(Person p1, Person p2) {
		if(p1.compareTo(p2) > 0) {
			System.out.println("e1 is greater");
		}
		else if(p1.compareTo(p2) < 0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}

}
