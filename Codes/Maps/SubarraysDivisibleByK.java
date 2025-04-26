package Maps;
import java.util.HashMap;
import java.util.ArrayList;

public class SubarraysDivisibleByK {

	// Method to count subarrays whose sum is divisible by K
	public static int countSubarraysDivisibleByK(ArrayList<Integer> arr, int k) {
		// Create a HashMap to store the remainder and its frequency
		HashMap<Integer, Integer> map = new HashMap<>();

		// Initialize the map with remainder 0 having frequency 1
		map.put(0, 1);

		int prefixSum = 0;  // To store the running prefix sum
		int count = 0;      // To store the count of valid subarrays

		// Traverse through the array
		for (int num : arr) {
			// Update the prefix sum
			prefixSum += num;

			// Calculate the remainder of prefix sum modulo k
			int rem = prefixSum % k + k;  // Ensure non-negative remainder

			// If the remainder exists in the map, add its frequency to count
			if (map.containsKey(rem)) {
				count += map.get(rem);
			}

			// Update the map with the current remainder
			map.put(rem, map.getOrDefault(rem, 0) + 1);
		}

		// Return the count of valid subarrays
		return count;
	}

	public static void main(String[] args) {
		// Test case 1
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(2);
		arr1.add(3);
		arr1.add(1);
		int k1 = 2;
		System.out.println(countSubarraysDivisibleByK(arr1, k1));  // Output: 3

		// Test case 2
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		int k2 = 1;
		System.out.println(countSubarraysDivisibleByK(arr2, k2));  // Output: 10
	}
}
