package day_6;
import java.util.Scanner;
public class ArrayIn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter the array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
