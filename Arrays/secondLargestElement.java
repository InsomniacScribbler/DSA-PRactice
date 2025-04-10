import java.util.* ;
import java.io.*;
public class secondLargestElement {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		if (n < 2) {
			return -1;
		}

		int largest = Integer.MIN_VALUE;
		int slargest = Integer.MIN_VALUE;

		// Find the largest number
		for (int x : arr) {
			if (x > largest) {
				largest = x;
			}
		}

		// Find the second largest number
		for (int y : arr) {
			if (y > slargest && y < largest) {
				slargest = y;
			}
		}

		// If slargest is still Integer.MIN_VALUE, it means there was no valid second largest number
		if (slargest == Integer.MIN_VALUE) {
			return -1;
		}

		return slargest;
	}
}