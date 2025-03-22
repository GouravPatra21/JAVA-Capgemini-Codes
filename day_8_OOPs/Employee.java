package day_8_OOPs;

public class Employee {
	int id;
	String name;
	double salary;
	String companyName;
	public Employee() {
		System.out.println("No arg Constructor");
		
	}
	public Employee(int id) {
		this();
		this.id = id;
		System.out.println("one arg Constructor");
		
	}
	public Employee(int id, String name) {
		this(id);
		this.name = name;
		System.out.println("two arg Constructor");
		
	}
	public Employee(int id, String name, double salary) {
		this(id, name);
		this.salary = salary;
		System.out.println("three arg Constructor");
		
	}
	public Employee(int id, String name, double salary, String companyName) {
		this(id, name, salary);
		this.companyName = companyName;
		System.out.println("four arg Constructor");
		
	}

}
