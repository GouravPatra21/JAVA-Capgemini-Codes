package Lambda_expressions;

public class Employee implements Comparable<Employee>{
	String name;
	int id;
	Employee(int id, String name) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return this.id + " " + this.name;
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return (int)(this.id - e.id);
	}

}
