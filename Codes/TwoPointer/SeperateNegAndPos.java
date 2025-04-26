package TwoPointer;

import java.util.Arrays;

public class SeperateNegAndPos {

	// Method to separate negative and positive integers
	public static int[] separateNegativeAndPositive(int arr[]) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			if (arr[start] < 0) {
				start++;
			} else if (arr[end] > 0) {
				end--;
			} else {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return arr;
	}

	// Method to swap two elements in the array
	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	// Driver code to test the separateNegativeAndPositive function
	public static void main(String[] args) {
		// Hardcoded input
		int[] arr = { 20, -16, 9, -25, 8, 44, 20, 20, -12, 11, -44, -32, 7, 41, 13, 7, 27, -49, -19, -43, 6 };

		// Call the method to separate negative and positive numbers
		int[] result = separateNegativeAndPositive(arr);

		// Print the result
		System.out.println("Array after separating negative and positive numbers:");
		System.out.println(Arrays.toString(result));
	}
}
