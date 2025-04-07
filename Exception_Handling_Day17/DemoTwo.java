package Exception_Handling_Day17;
import java.util.Scanner;
public class DemoTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
//		try {
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			System.out.println(x/y);
//			sc.close();
//		}
//		catch(Exception e) {
//			System.out.println("Exception Handled");
//		}
//		finally {
//			sc.close();
//			System.out.println("Finally block");
//		}
		try(Scanner scan  = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x/y);
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		finally {
			sc.close();
			System.out.println("Finally block");
		}
	}

}
