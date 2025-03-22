package practice;
import java.util.*;
import java.util.HashMap;

public class DutchNationalFlagUsingHashMap {
	static void logic(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> colorMap = new HashMap<>();
        colorMap.put(0, "Red");
        colorMap.put(1, "Blue");
        colorMap.put(2, "Green");
        System.out.print("Enter the number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (0, 1, or 2): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        logic(arr);
        System.out.println("Sorted array with values:");
        for (int num : arr) {
            System.out.print(colorMap.get(num) + " ");
        }

        scanner.close();
    }
}

