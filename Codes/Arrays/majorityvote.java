package Arrays;// Java program for finding the majority element in an array
// using Moore’s Voting algorithm

import java.util.ArrayList;
import java.util.List;

public class majorityvote {

	// Function to find Majority element in an array
	static List<Integer> findMajority(int[] arr) {
		int n = arr.length;

		// Initialize two candidates and their counts
		int ele1 = -1, ele2 = -1;
		int cnt1 = 0, cnt2 = 0;

		for (int ele : arr) {

			// Increment count for candidate 1
			if (ele1 == ele) {
				cnt1++;
			}

			// Increment count for candidate 2
			else if (ele2 == ele) {
				cnt2++;
			}

			// New candidate 1 if count is zero
			else if (cnt1 == 0) {
				ele1 = ele;
				cnt1++;
			}

			// New candidate 2 if count is zero
			else if (cnt2 == 0) {
				ele2 = ele;
				cnt2++;
			}

			// Decrease counts if neither candidate
			else {
				cnt1--;
				cnt2--;
			}
		}

		List<Integer> res = new ArrayList<>();
		cnt1 = 0;
		cnt2 = 0;

		// Count the occurrences of candidates
		for (int ele : arr) {
			if (ele1 == ele) cnt1++;
			if (ele2 == ele) cnt2++;
		}

		// Add to result if they are majority elements
		if (cnt1 > n / 3) res.add(ele1);
		if (cnt2 > n / 3 && ele1 != ele2) res.add(ele2);

		if (res.size() == 2 && res.get(0) > res.get(1)) {
			int temp = res.get(0);
			res.set(0, res.get(1));
			res.set(1, temp);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
		List<Integer> res = findMajority(arr);
		for (int ele : res) {
			System.out.print(ele + " ");
		}
	}
}
/*// Java program for finding out majority element in an array
// using hash map

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class GfG {

    // Function to find Majority element in an array
    static List<Integer> findMajority(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        // find frequency of each number
        for (int ele : arr)
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);

        // Iterate over each key-value pair in the hash map
        for (Map.Entry<Integer, Integer> it : freq.entrySet()) {
            int ele = it.getKey();
            int cnt = it.getValue();

            // Add the element to the result, if its frequency
        	// if greater than floor(n/3)
            if (cnt > n / 3)
                res.add(ele);
        }

        if (res.size() <= 2 && res.get(0) > res.get(1)) {
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        List<Integer> res = findMajority(arr);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}*/