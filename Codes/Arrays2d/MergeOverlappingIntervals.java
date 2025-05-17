package Arrays2d;

import java.util.Arrays;

public class MergeOverlappingIntervals {
	public static void main(String[] args) {
		Solution solution = new Solution();

		// Example input intervals
		int[][] intervals = {
				{1, 3},
				{2, 6},
				{8, 10},
				{15, 18}
		};

		int[][] merged = solution.merge(intervals);

		System.out.println("Merged Intervals:");
		for (int[] interval : merged) {
			System.out.println(Arrays.toString(interval));
		}
	}
}

class Solution {
	public int[][] merge(int[][] intervals) {
		if (intervals.length == 0) return new int[0][0];
		int n = intervals.length;
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		int write = 0;
		for (int i = 0; i < n; i++) {
			if (intervals[write][1] >= intervals[i][0]) {
				intervals[write][1] = Math.max(intervals[write][1], intervals[i][1]);
			} else {
				write++;
				intervals[write] = intervals[i];
			}
		}
		return Arrays.copyOfRange(intervals, 0, write + 1);
	}
}

