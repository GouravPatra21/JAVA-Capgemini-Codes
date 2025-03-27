package Problem_on_OOPs_3;

public class PartTimeEmployee extends Employee {
	private int workingHours;
	public PartTimeEmployee(String name, double salary, int workingHours) {
		super(name, salary);
		this.workingHours = workingHours;
	}
	void employeeInfo() {
		super.employeeInfo();
		System.out.println("Working Time:" + this.workingHours);
		
	}
	void designation() {
		System.out.println("The Employee is an Associate Software Engineer");
	}
	public void jobRole() {
		System.out.println("The Job Role of a Part Time Employee is Cloud Engineer");
		
	}
	
	

}
