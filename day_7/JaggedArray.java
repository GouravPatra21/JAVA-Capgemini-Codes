package day_7;

import java.util.Scanner;

public class JaggedArray {
	public static int[][] create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int row = sc.nextInt();
		int[][] jaggarr = new int[row][];
		for(int i = 0; i < row; i++) {
			System.out.println("Enter the no of columns for" + (i + 1) + "rows");
			int col = sc.nextInt();
			jaggarr[i] = new int[col];
		}
		System.out.println("Enter the elements in jagged array:");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < jaggarr[i].length; j++) {
				jaggarr[i][j] = sc.nextInt();
			}
		}
		return jaggarr;
		
	}
	public static void traverse(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr1 = create();
		traverse(arr1);
	}

}
