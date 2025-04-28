package Stack_usingArray_Day22;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int size = sc.nextInt();
		Stack stack = new Stack(size);
		boolean flag = true;
		while(flag) {
		System.out.println("Enter the stack operation you want to perform");
		System.out.println("1 for Push");
		System.out.println("2 for Pop");
		System.out.println("3 for peek");
		System.out.println("4 for display");
		System.out.println("5 for Exit");
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: {
			System.out.println("Enter the value to Push");
			int value = sc.nextInt();
			stack.push(value);
			break;
		}
		case 2: {
			stack.pop();
			break;
		}
		case 3: {
			int topvalue = stack.peek();
			if(topvalue != -1) {
				System.out.println("Top element is: " + topvalue);
			}
			break;
		}
		case 4: {
			stack.display();
			break;
		}
		case 5:
			System.out.println("Exited Successfully");
			flag = false;
			break;
		default:
			System.out.println("Invalid Choice");
		}
		}
		
	}

}
