package Arrays2d;

import java.util.Scanner;

public class spiralPrintMatrix {

	public static void spiralPrint(int[][] matrix) {
		if (matrix.length == 0) return;

		int n = matrix.length;        // number of rows
		int m = matrix[0].length;     // number of columns

		int top = 0, bottom = n - 1;
		int left = 0, right = m - 1;

		while (top <= bottom && left <= right) {

			// Print the top row
			for (int i = left; i <= right; i++) {
				System.out.print(matrix[top][i] + " ");
			}
			top++;

			// Print the right column
			for (int i = top; i <= bottom; i++) {
				System.out.print(matrix[i][right] + " ");
			}
			right--;

			// Print the bottom row if still in bounds
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--;
			}

			// Print the left column if still in bounds
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(matrix[i][left] + " ");
				}
				left++;
			}
		}
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // number of test cases

		while (t-- > 0) {
			int n = sc.nextInt(); // number of rows
			int m = sc.nextInt(); // number of columns

			int[][] matrix = new int[n][m];

			// Input the matrix
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			// Call spiral print function
			spiralPrint(matrix);
			System.out.println();
		}

		sc.close();
	}
}

