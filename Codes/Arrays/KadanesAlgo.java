package Arrays;
/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

---DONE WITH KADANES ALGORITHM , USE IT FOR MAX SUBARRAY SUMS---
 */



public class KadanesAlgo {

    public int maxSubArray(int[] arr) {
        // Stores the result (maximum sum found so far)
        int res = arr[0];

        // Maximum sum of subarray ending at current position
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Either extend the previous subarray or start
            // new from current element
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            // Update result if the new subarray sum is larger
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        KadanesAlgo obj = new KadanesAlgo();

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Calling the maxSubArray method
        int maxSum = obj.maxSubArray(arr);

        // Printing the maximum subarray sum
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
