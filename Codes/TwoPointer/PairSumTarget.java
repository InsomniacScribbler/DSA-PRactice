package TwoPointer;
import java.util.*;

public class PairSumTarget {

	public static int pairSum(int arr[], int n, int target) {
		int count = 0, left = 0, right = n - 1;

		while (left < right) {
			int sum = arr[left] + arr[right];

			if (sum < target) {
				left++;
			} else if (sum > target) {
				right--;
			} else {
				count++;
				left++;
				right--;
			}
		}

		return (count > 0) ? count : -1;
	}

	public static void main(String[] args) {
		// Hardcoded test cases
		int[] arr1 = {1, 2, 3, 4, 5};
		int target1 = 6;
		int n1 = arr1.length;

		int[] arr2 = {1, 2, 3, 4, 5, 6};
		int target2 = 7;
		int n2 = arr2.length;

		int[] arr3 = {1, 3, 5, 6};
		int target3 = 10;
		int n3 = arr3.length;

		int[] arr4 = {1, 3, 6, 9, 11};
		int target4 = 12;
		int n4 = arr4.length;

		// Testing the pairSum method with hardcoded inputs
		System.out.println("Test Case 1 Result: " + pairSum(arr1, n1, target1)); // Output: 2
		System.out.println("Test Case 2 Result: " + pairSum(arr2, n2, target2)); // Output: 3
		System.out.println("Test Case 3 Result: " + pairSum(arr3, n3, target3)); // Output: -1
		System.out.println("Test Case 4 Result: " + pairSum(arr4, n4, target4)); // Output: 2
	}
}
