package Singly_Linked_List_Day20;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to insert data \n Enter 2 to display \n Enter 3 to update \n Enter 4 to insert: \n Enter 5 to delete: \n Enter 6 to exit:");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the data");
				int data = sc.nextInt();
				list.insert(data);
				break;
			}
			case 2:
				list.display();
				break;
			case 3: {
				System.out.println("Enter data to update");
				int newdata  = sc.nextInt();
				System.out.println("Enter the position between 1 to "+ list.count + " to update:");
				int position = sc.nextInt();
				list.update(position, newdata);
				break;
			}
			case 4: {
				System.out.println("Enter data to update");
				int newdata  = sc.nextInt();
				System.out.println("Enter the position between 1 to "+ list.count + " to insert:");
				int position = sc.nextInt();
				list.insertAt(position, newdata);
				break;
			}
			case 5: {
				System.out.println("Enter the position between 1 to "+ list.count + " to delete:");
				int position = sc.nextInt();
				list.deleteAt(position);
				break;
			}
				
			case 6:
				flag = false;
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}

}
