package Maps;

import java.util.*;

public class MakeUniqueArray {

	public static int minElementsToRemove(ArrayList<Integer> arr) {
		// Create a map to store frequencies
		HashMap<Integer, Integer> freqMap = new HashMap<>();

		// Count the frequency of each element
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}

		int countToRemove = 0;

		// Sum up (frequency - 1) for each repeated element
		for (int freq : freqMap.values()) {
			if (freq > 1) {
				countToRemove += (freq - 1);
			}
		}

		return countToRemove;
	}

	public static void main(String[] args) {
		// Test Case 1
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 1, 2));
		System.out.println("Elements to remove (Test 1): " + minElementsToRemove(arr1)); // Output: 2

		// Test Case 2
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(3, 6, 7, 12, 13));
		System.out.println("Elements to remove (Test 2): " + minElementsToRemove(arr2)); // Output: 0

		// Test Case 3
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
		System.out.println("Elements to remove (Test 3): " + minElementsToRemove(arr3)); // Output: 3

		// Test Case 4
		ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2));
		System.out.println("Elements to remove (Test 4): " + minElementsToRemove(arr4)); // Output: 2
	}
}

