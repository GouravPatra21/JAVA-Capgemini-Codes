package day_8_OOPs;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee s1 = new Employee(2, "Ram", 25000.00);
		System.out.println(s1.id + " " + s1.name + " " + s1.salary);
		Employee s2 = new Employee(2, "Ram", 25000.00, "IEM");
		System.out.println(s2.id + " " + s2.name + " " + s2.salary + " " + s2.companyName);
	}

}
