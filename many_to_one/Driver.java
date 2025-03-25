package many_to_one;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id:");
		int customerId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name:");
		String customerName1 = sc.nextLine();
		Customer customer = new Customer(customerId, customerName1);
		boolean flag = true;
		while(flag) {
			System.out.println("Menu-");
			System.out.println("Enter 1 to Add your Bank");
			System.out.println("Enter 2 to view your Bank");
			System.out.println("Enter 3 to exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter your Bank Name:");
				String name = sc.nextLine();
				Bank bank = new Bank(name);
				customer.addBank(bank);
				System.out.println("Bank added Succesfully");
				break;
			case 2:
				System.out.println("No of Bank associated with customer");
				customer.display();
				break;
			case 3:
				System.out.println("Exited Succesfully");
				flag = false;
				break;
			default:
				System.out.println("Invalid Choice");
			}
			
			
			
		}
		sc.close();
		
	}

}