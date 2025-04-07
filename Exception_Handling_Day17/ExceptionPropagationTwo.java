package Exception_Handling_Day17;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionPropagationTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter two numbers");
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x/y);
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Handled");
		}
		catch(InputMismatchException e) {
			System.out.println("Input MismatchException Handled");
		}
		try {
			sc.nextLine();
			int[] arr = {1, 2, 3, 4, 5};
			System.out.println("Enter the index to access");
			System.out.println(arr[sc.nextInt()]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutofBoundException Handled");
		}
		try {
			Class.forName("Demo");
		}
		catch(Exception e) {
			System.out.println("Class Not Found Exception Handled");
		}
		sc.close();
	}

}
