package Arrays;

public class nextPermutation {
	// Function to find the next permutation
	static void nxtPer(int[] arr) {
		int n = arr.length;

		// Step 1: Find the first decreasing element from the end
		int i = n - 2;
		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
		}

		if (i >= 0) {
			// Step 2: Find the next larger element than arr[i] from the end
			int j = n - 1;
			while (arr[j] <= arr[i]) {
				j--;
			}

			// Step 3: Swap arr[i] and arr[j]
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		// Step 4: Reverse the subarray from i + 1 to the end
		reverse(arr, i + 1, n - 1);
	}

	// Helper function to reverse a portion of the array
	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 1, 7, 5, 0}; // Input array
		nxtPer(arr); // Call the function
		System.out.println(java.util.Arrays.toString(arr)); // Output the result
	}
}
