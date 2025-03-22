package day_6;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,4,45,67,78};
		int[] arr2 = {1,4,5,67,78};
		int target = 45;
		System.out.println(Arrays.binarySearch(arr, target));
		
		int[] array = Arrays.copyOf(arr, 7);
		for(int i : array ) {
			System.out.println(i);
		}
		
		for(int i : Arrays.copyOfRange(arr, 0, 3)) {
			System.out.println(i);
		}
		System.out.println(Arrays.equals(arr, arr2));
		int[] result = {4,2,67,7,9,36};
		for (int i : result) {
			System.out.println(i);
		}
		Arrays.sort(result);
		Arrays.toString(result);
		
	}

}
