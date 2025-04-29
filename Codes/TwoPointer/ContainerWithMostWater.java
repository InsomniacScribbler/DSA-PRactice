package TwoPointer;

public class ContainerWithMostWater {

	public static int maxArea(int[] A) {
		int left = 0;
		int right = A.length - 1;
		int maxArea = 0;

		while (left < right) {
			int height = Math.min(A[left], A[right]);
			int width = right - left;
			int area = height * width;

			maxArea = Math.max(maxArea, area);

			// Move the pointer with the smaller height
			if (A[left] < A[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxArea;
	}

	public static void main(String[] args) {
		// Hardcoded input
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

		int result = maxArea(height);

		System.out.println("Maximum water that can be stored: " + result);
	}
}

