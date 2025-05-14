package Arrays2d;
import java.util.*;

public class pascalsTriangle {
	public List<List<Integer>> generate(int n) {
		List<List<Integer>> pas = new ArrayList<>();

		for (int row = 0; row < n; row++) {
			List<Integer> temp = new ArrayList<>();
			int ans = 1;
			temp.add(ans);

			for (int col = 1; col <= row; col++) {
				ans = ans * (row - col + 1) / col;
				temp.add(ans);
			}

			pas.add(temp);
		}

		return pas;
	}

	public static void main(String[] args) {
		// Create an instance of the PascalsTriangle class
		pascalsTriangle sol = new pascalsTriangle();

		// Test case 1: n = 5
		int n1 = 7;
		List<List<Integer>> result1 = sol.generate(n1);
		System.out.println("Pascal's Triangle for n = " + n1 + ":");
		for (List<Integer> row : result1) {
			System.out.println(row);
		}

		// Test case 2: n = 1
		int n2 = 1;
		List<List<Integer>> result2 = sol.generate(n2);
		System.out.println("\nPascal's Triangle for n = " + n2 + ":");
		for (List<Integer> row : result2) {
			System.out.println(row);
		}

		// Test case 3: n = 0 (Edge case, no rows)
		int n3 = 0;
		List<List<Integer>> result3 = sol.generate(n3);
		System.out.println("\nPascal's Triangle for n = " + n3 + ":");
		for (List<Integer> row : result3) {
			System.out.println(row);
		}
	}
}
