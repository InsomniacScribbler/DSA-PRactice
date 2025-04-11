public class EquilibriumIndex {

	public static int arrayEquilibriumIndex(int[] arr) {
		int n = arr.length;

		int leftSum = 0, total = 0, rightSum = 0;
		for (int x : arr) total += x;

		for (int i = 0; i < n; i++) {
			rightSum = total - leftSum - arr[i];
			if (rightSum == leftSum) return i;
			leftSum += arr[i];
		}

		return -1;
	}

	public static void main(String[] args) {
		int[][] testCases = {
				{1, 3, 5, 2, 2},   				{2, 1, 3},
				{10}               		};

		for (int i = 0; i < testCases.length; i++) {
			int result = arrayEquilibriumIndex(testCases[i]);
			System.out.println("Test Case " + (i+1) + ": Equilibrium Index = " + result);
		}
	}
}
