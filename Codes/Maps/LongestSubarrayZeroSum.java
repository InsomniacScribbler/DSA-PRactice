package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarrayZeroSum {
	public static int longestSubarrayWithZeroSum(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int prefix_sum = 0;
		int max_len = 0;

		for (int i = 0; i < arr.length; i++) {
			prefix_sum += arr[i];

			if (prefix_sum == 0) {
				max_len = i + 1;
			}

			if (map.containsKey(prefix_sum)) {
				int length = i - map.get(prefix_sum);
				max_len = Math.max(max_len, length);
			} else {
				map.put(prefix_sum, i);
			}
		}

		return max_len;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // Number of test cases

		while (T-- > 0) {
			int N = sc.nextInt(); // Size of array
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(longestSubarrayWithZeroSum(arr));
		}

		sc.close();
	}
}
