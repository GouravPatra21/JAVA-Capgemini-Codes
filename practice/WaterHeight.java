package practice;
import java.util.*;
public class WaterHeight {
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxWater = 0;
		while(left < right) {
			int width = right - left;
			int h = Math.min(height[left], height[right]);
			int water = width * h;
			maxWater = Math.max(maxWater, water);
			if (height[left] < height[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		return maxWater;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the height of the towers in which water needs to be present:");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int maximumWater = maxArea(arr);
		System.out.println("The maximum height of the water:" + maximumWater);
		sc.close();
	}

}
