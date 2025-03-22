package day_6;
import java.util.*;
public class PalindromeInArray {
	public static int[] arrayIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n = sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
		
	}
	public static void palindromeChecker(int[] arr1) {
		
		for(int val : arr1) {
			int original = val;
			int sum = 0, rem = 0;
			while(val > 0) {
				rem = val % 10;
				sum = sum * 10 + rem;
				val = val / 10;
			}
			if(original == sum) {
				System.out.println("The Palindrome in this array is:" + original);
			}
			else {
				System.out.println("There is no palindrome no in this array:" + original);
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr1 = arrayIn();
		palindromeChecker(arr1);
		
	}

}
