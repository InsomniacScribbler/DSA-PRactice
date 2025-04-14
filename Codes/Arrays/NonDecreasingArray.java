package Arrays;

public class NonDecreasingArray {

	// Checks if array can be non-decreasing with at most one change
	public static boolean isPossible(int[] arr, int n) {
		int modifications = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				modifications++;

				if (modifications > 1) return false;

				// Decide which element to adjust
				if (i == 0 || arr[i - 1] <= arr[i + 1]) {
					arr[i] = arr[i + 1];  // lower current
				} else {
					arr[i + 1] = arr[i];  // raise next
				}
			}
		}

		return true;
	}

    /*
    // Version without modifying the array (just checks possibility)
    public static boolean isPossible(int[] arr, int n) {
        int modifications = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                modifications++;

                if (modifications > 1) return false;

                // Checks if surrounding elements make it unfixable
                if (i > 0 && i + 2 < n && arr[i - 1] > arr[i + 1] && arr[i] > arr[i + 2]) {
                    return false;
                }
            }
        }

        return true;
    }
    */

	// Test cases
	public static void main(String[] args) {
		int[] arr1 = {3, 4, 2, 5}; // true
		int[] arr2 = {4, 2, 1};    // false

		System.out.println(isPossible(arr1, arr1.length));
		System.out.println(isPossible(arr2, arr2.length));
	}
}
