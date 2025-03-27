package Problem_on_OOPs_3;

public class Driver {
	public static void main(String[] args) {
		Employee e = new FullTimeEmployee("Gourav Patra", 30000, 10000);
		e.employeeInfo();
		((FullTimeEmployee)e).jobRole();
		Employee p = new PartTimeEmployee("koustav Dey", 30000, 8);
		p.employeeInfo();
//		((PartTimeEmployee)p).designation();
		details(p);
		
	}
	static void details(Employee e) {
		if(e instanceof FullTimeEmployee) { //instanceof is used to check type of objects. It is mainly used in cases to avoid class class exception during downcasting.
			e.jobRole();
		}
		else {
			e.jobRole();
			((PartTimeEmployee)e).designation();
		}
	}

}
