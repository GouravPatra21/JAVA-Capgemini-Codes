package Problem_on_OOPs_3;

public class FullTimeEmployee extends Employee {
	private int bonus;
	public FullTimeEmployee(String name, double salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	void employeeInfo() {
		super.employeeInfo();
		System.out.println("Bonus:" + this.bonus);
		
	}
	void jobRole() {
		System.out.println("The Job role is of a Developer");
	}

}
