package one_to_many;
import java.util.Scanner;
public class Diver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		Bank bank = new Bank(size, "SBI");
		boolean flag = true;
		while(flag) {
			System.out.println("Ente 1 to add customer\nEneter 2 to display customers" + "\nEnter 3 to exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Ente your Customer Id");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter customer name");
				String name = sc.nextLine();
				Customer customer = new Customer(name, id);
				bank.addCustomer(customer);
				
			case 2:
				bank.displayCustomers();
				break;
			case 3:
				flag = false;
				break;
			}
		}
		sc.close();
		
	}

}
