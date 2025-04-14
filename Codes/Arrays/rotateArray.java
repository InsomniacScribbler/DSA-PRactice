package Arrays;

import java.util.Arrays;

//public class Arrays.rotateArray {
	/*BRUTE FORCE -- public static int[] rotate(int arr[],int d){
		int n = arr.length;
		for (int i = 0; i < d; i++) {
			int first = arr[0];
			for(int j = 0; j<n-1;j++){
				arr[j]= arr[j+1];
			}
			arr[n-1] = first;
		}*/
	/*BETTER --- static void rotateArr(int[] arr, int d) {
        int n = arr.length;

        // Handle case when d > n
        d %= n;

        // Storing rotated version of array
        int[] temp = new int[n];

        // Copy last n - d elements to the front of temp
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[d + i];

        // Copy the first d elements to the back of temp
        for (int i = 0; i < d; i++)
            temp[n - d + i] = arr[i];

        // Copying the elements of temp in arr
        // to get the final rotated array
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];*/
	//Juggling Algorithm


		//return arr;
	//}


public class rotateArray {
	// Function to rotate an array by d elements in counter-clockwise direction
	static void rotateArr(int arr[], int d) {
		int n = arr.length;

		// Handle cases where d > n
		d %= n;

		// Handle edge cases where rotation isn't needed
		if (d <= 0 || n == 0) {
			return;
		}

		// Step 1: Reverse the first part (from index 0 to d-1)
		reverse(arr, 0, d - 1);

		// Step 2: Reverse the second part (from index d to n-1)
		reverse(arr, d, n - 1);

		// Step 3: Reverse the entire array (from index 0 to n-1)
		reverse(arr, 0, n - 1);
	}

	// Helper function to reverse a portion of the array
	static void reverse(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8}; // Initialize the array
		int d = 3; // Number of rotations

		rotateArr(arr, d); // Rotate the array
		System.out.println(Arrays.toString(arr)); // Print the rotated array
	}
}