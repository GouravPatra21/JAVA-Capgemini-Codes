package day_6;
import java.util.*;
public class ArmstrongNumber {
	public static void armstrong(int num) {
		int temp = num;
		int rem = 0, sum = 0;
		int n = String.valueOf(num).length();
		while(num>0) {
			rem = num % 10;
			sum += Math.pow(rem,n);
			num = num / 10;
		}
		if(temp == sum) {
			System.out.println("The no is Armstrong");
		}
		else {
			System.out.println("The no is not armstrong");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Armstrong No:");
		int num = sc.nextInt();
		armstrong(num);
	}

}
