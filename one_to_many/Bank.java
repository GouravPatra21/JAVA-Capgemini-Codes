package one_to_many;

public class Bank {

	Customer[] customers;
	String bankName;
	static int count = 0;
	public Bank(int size, String bankName) {
		this.customers = new Customer[size];
		this.bankName = bankName;
	}
	public void addCustomer(Customer customer) {
		if(count  < customers.length) {
			customers[count++] = customer;
			System.out.println("Customers added");
		}
		else {
			System.out.println("Cannot add Customers, the array is filled");
		}
	}
	public void displayCustomers() {
		for(int i = 0; i < count; i++) {
			Customer c = customers[i];
			System.out.println(c.customerName);
		}
	}
//	public void removeCustomers(Customer customer) {
//		for(int i = 0; i < count; i++) {
//			
//		}
//	}
}
