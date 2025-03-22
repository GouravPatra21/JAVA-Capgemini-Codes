package practice;

import java.util.*;

public class DutchNationalFlag {
	public static void logic(int[] arr) {
		int low = 0, mid = 0, high = arr.length - 1;
		while(mid <= high) {
			if(arr[mid] == 0) {
				swap(arr, mid, low);
				mid++;
				low++;
			}
			else if(arr[mid] == 1) {
				mid++;
			}
			else {
				swap(arr, mid, high);
				high--;
			}
		}
		
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n = sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		logic(arr);
		System.out.println("Sorted Array");
		for(int val : arr) {
			System.out.println(val + " ");
		}
		sc.close();
	}

}
