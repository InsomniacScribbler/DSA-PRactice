package Arrays2d;

import java.util.*;

public class MatrixSetZeros {

	// Function to set entire row and column to zero in-place
	public static void setZeros(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean firstRowZero = false;
		boolean firstColZero = false;

		// Check if first row needs to be zero
		for (int j = 0; j < cols; j++) {
			if (matrix[0][j] == 0) {
				firstRowZero = true;
				break;
			}
		}

		// Check if first column needs to be zero
		for (int i = 0; i < rows; i++) {
			if (matrix[i][0] == 0) {
				firstColZero = true;
				break;
			}
		}

		// Use first row and column as markers
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		// Set cells to zero based on markers
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		// Zero out the first row if needed
		if (firstRowZero) {
			for (int j = 0; j < cols; j++) {
				matrix[0][j] = 0;
			}
		}

		// Zero out the first column if needed
		if (firstColZero) {
			for (int i = 0; i < rows; i++) {
				matrix[i][0] = 0;
			}
		}
	}

	// Main method to read input and call the function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // Number of test cases

		while (t-- > 0) {
			int n = sc.nextInt(); // Number of rows
			int m = sc.nextInt(); // Number of columns
			int[][] matrix = new int[n][m];

			// Input matrix
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			// Call the in-place zero-setting function
			setZeros(matrix);

			// Output the updated matrix
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		}

		sc.close();
	}
}

