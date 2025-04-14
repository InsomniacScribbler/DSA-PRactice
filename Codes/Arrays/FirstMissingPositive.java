package Arrays;

public class FirstMissingPositive {

	public static int MissingPositive(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			// Place each number in its correct position if it's in the range [1, n]
			while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
				int correctIndex = arr[i] - 1;
				// Swap arr[i] and arr[correctIndex]
				int temp = arr[i];
				arr[i] = arr[correctIndex];
				arr[correctIndex] = temp;
			}
		}

		// After placement, the first index where arr[i] != i+1 is the answer
		for (int i = 0; i < n; i++) {
			if (arr[i] != i + 1) {
				return i + 1;
			}
		}

		// If all positions are filled correctly
		return n + 1;
	}

	public static void main(String[] args) {
		int[] arr1 = {3, 4, -1, 1}; // Output: 2
		int[] arr2 = {0, 1, 2, 3, 4}; // Output: 5
		int[] arr3 = {1, 2, 3}; // Output: 4

		System.out.println(MissingPositive(arr2, arr2.length));
		System.out.println(MissingPositive(arr3, arr3.length));
		System.out.println(MissingPositive(arr1, arr1.length));
	}
}
