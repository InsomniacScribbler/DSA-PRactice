package BasicAlgorithms;

public class InsertionSort {

	// Function to perform insertion sort
	public static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			// Move elements of arr[0..i-1], that are greater than key,
			// to one position ahead of their current position
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	// Utility function to print the array
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// Main method with hardcoded input
	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 5, 6};

		System.out.println("Original array:");
		printArray(arr);

		insertionSort(arr);

		System.out.println("Sorted array using Insertion Sort:");
		printArray(arr);
	}
}
