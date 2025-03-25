package many_to_one;
import java.util.ArrayList;
import java.util.List;
public class Customer {
	int id;
	String customerName;
	List<Bank> banks;
	public Customer(int id, String customerName) {
		this.id = id;
		this.customerName = customerName;
		this.banks = new ArrayList<>();
	}
	public void addBank(Bank bank) {
		this.banks.add(bank);
	}
	public void display() {
		System.out.println("Custome Id:" + this.id);
		System.out.println("Customer Name:" + this.customerName);
		System.out.println("Associate Banks");
		for(Bank bank : banks) {
			System.out.println("- " + bank.bankName);
		}
		System.out.println();
	}

}
