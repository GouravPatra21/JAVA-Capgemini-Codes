package ComparableAndComparator;

public class Employee implements Comparable {
    int id;
    String name;
    double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}
	// Comparing based on Salary
//	public int compareTo(Object o) {
//		Employee e = (Employee)o;
//		return (int)(this.salary - e.salary); //this.salary is e1's(currently existing object) and e.salary is e2's passed object
//	}
	
	// Comparing based on String
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		return this.name.compareTo(e.name);
	}

}
