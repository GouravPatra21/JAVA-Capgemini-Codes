package List;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	public String toString() {
		return this.id + " " + this.name;
	}
	public int compareTo(Employee e) {
		return this.id - e.id;
	}
}
