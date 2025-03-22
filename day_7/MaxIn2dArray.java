package day_7;

import java.util.Scanner;

public class MaxIn2dArray {
	public static int[][] inArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int row = sc.nextInt();
		System.out.println("Enter the no of Columns");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter the elemnts of matrix:");
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;

	}
	public static int maximum(int[][] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[][] arr1 = inArray();
		System.out.println("The maximum element in the array:" + maximum(arr1));
	}

}
