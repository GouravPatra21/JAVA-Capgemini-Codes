package Exception_Handling_Day17;

public class Company {
//  Company c = new Company() // Stack Overflow error because wheb comapny(	
	static Company c = new Company();
	Company() {
		
	}
	public static void main(String[] args) {
		Company c = new Company();
	}

}
