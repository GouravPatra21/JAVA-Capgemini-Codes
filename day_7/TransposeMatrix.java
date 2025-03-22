package day_7;

import java.util.Scanner;

public class TransposeMatrix {
	public static void inArray() {
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
		int[][] transpose = new int[col][row];
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
     			transpose[j][i] = arr[i][j];
			}
		}
		System.out.println("Transpose matrix:");
        for (int i = 0; i < col; i++) {  // Loop runs till col (not arr[i].length)
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		 inArray();
	}

}

