package day_6;
import java.util.*;

public class FactorialNumber {
	public static int factorial(int n) {
		int factor = 1;
		if(n>0) {
			for(int i = 1; i <= n; i++) {
				factor = factor * i;
			}
		}
		else {
			System.out.println("Invalid Entry");
		}
		return factor;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println("The factorial is :" + result);
		
	}

}
