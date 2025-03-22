package day_7;
import java.util.Scanner;
import java.util.Arrays;
public class Array_2D {
	public static void main(String[] args) {
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
//		System.out.println("The elements in 2D array:");
//		for (int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		System.out.println("2D array using Arrays.deepToString():");
//        System.out.println(Arrays.deepToString(arr));
		
		System.out.println("The elements in 2D Array are:");
        for (int[] rows : arr) {
        	for (int elements : rows) {
        		System.out.print(elements + " ");
        	}
        	System.out.println();
        }
		
		sc.close();
		
	}
	

}
