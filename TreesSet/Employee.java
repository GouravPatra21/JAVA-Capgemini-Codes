package TreesSet;

public class Employee implements Comparable<Employee> {
	String name;
	int salary;
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		
	}
	public String toString() {
		return this.name + " " + this.salary;
	}
	public int compareTo(Employee e) {
		return (int)(this.salary - e.salary);
	}
}