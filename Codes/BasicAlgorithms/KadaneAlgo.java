package BasicAlgorithms;

public class KadaneAlgo {
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int sum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			sum = Math.max(nums[i], sum + nums[i]);
			max = Math.max(max, sum);
		}

		return max;
	}

	public static void main(String[] args) {
		KadaneAlgo sol = new KadaneAlgo();

		int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Maximum Subarray Sum for nums1: " + sol.maxSubArray(nums1));

		int[] nums2 = { 1, 2, 3, 4, 5 };
		System.out.println("Maximum Subarray Sum for nums2: " + sol.maxSubArray(nums2));

		int[] nums3 = { -1, -2, -3, -4, -5 };
		System.out.println("Maximum Subarray Sum for nums3: " + sol.maxSubArray(nums3));

		int[] nums4 = { 3 };
		System.out.println("Maximum Subarray Sum for nums4: " + sol.maxSubArray(nums4));
	}
}
