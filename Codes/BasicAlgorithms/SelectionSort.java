package BasicAlgorithms;

public class SelectionSort {

	// Function to perform selection sort
	public static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			// Find the minimum element in unsorted part
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Swap the found minimum element with the first element
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	// Function to print the array
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// Main method with hardcoded input
	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11};

		System.out.println("Original array:");
		printArray(arr);

		selectionSort(arr);

		System.out.println("Sorted array using Selection Sort:");
		printArray(arr);
	}
}
