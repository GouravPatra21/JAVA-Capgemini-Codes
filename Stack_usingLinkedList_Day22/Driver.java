package Stack_usingLinkedList_Day22;
import java.util.Scanner;
public class Driver {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Stack stack = new Stack();
	        
	        while (true) {
	            System.out.println("\nStack Operations:");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Check if empty");
	            System.out.println("5. Get size");
	            System.out.println("6. Display stack");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = scanner.nextInt();
	            
	            try {
	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter value to push: ");
	                        int value = scanner.nextInt();
	                        stack.push(value);
	                        System.out.println(value + " pushed to stack.");
	                        break;
	                    case 2:
	                        System.out.println(stack.pop() + " popped from stack.");
	                        break;
	                    case 3:
	                        System.out.println("Top element is: " + stack.peek());
	                        break;
	                    case 4:
	                        System.out.println("Stack is " + (stack.isEmpty() ? "empty" : "not empty"));
	                        break;
	                    case 5:
	                        System.out.println("Stack size: " + stack.size());
	                        break;
	                    case 6:
	                        stack.display();
	                        break;
	                    case 7:
	                        System.out.println("Exiting program...");
	                        scanner.close();
	                        return;
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                }
	            } catch (RuntimeException e) {
	                System.out.println("Error: " + e.getMessage());
	            }
	        }
	    }
	}
