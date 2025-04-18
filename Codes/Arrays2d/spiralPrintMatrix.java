package Arrays2d;

import java.util.Scanner;

//public class Solution {
//
//	public static void spiralPrint(int matrix[][]){
//		//Your code goes here
//		// Get the number of rows
//		int row = matrix.length;
//
//		// Edge case: if matrix has no rows, nothing to print
//		if (row == 0) {
//			return;
//		}
//
//		// Get the number of columns
//		int col = matrix[0].length;
//
//		// Initialize the starting and ending indices for rows and columns
//		int sr = 0;           // Start Row
//		int er = row - 1;     // End Row
//		int sc = 0;           // Start Column
//		int ec = col - 1;     // End Column
//
//		// Keep track of how many elements we've printed
//		int count = 1;
//
//		// Total number of elements to be printed
//		int total = row * col;
//
//		// Traverse the matrix in spiral order
//		while (count <= total) {
//
//			// Step 1: Traverse the top row from left to right
//			for (int i = sc; i <= ec && count <= total; i++) {
//				System.out.print(matrix[sr][i] + " ");
//				count++;
//			}
//			sr++; // Move the top boundary down
//
//			// Step 2: Traverse the right column from top to bottom
//			for (int i = sr; i <= er && count <= total; i++) {
//				System.out.print(matrix[i][ec] + " ");
//				count++;
//			}
//			ec--; // Move the right boundary left
//
//			// Step 3: Traverse the bottom row from right to left
//			for (int i = ec; i >= sc && count <= total; i--) {
//				System.out.print(matrix[er][i] + " ");
//				count++;
//			}
//			er--; // Move the bottom boundary up
//
//			// Step 4: Traverse the left column from bottom to top
//			for (int i = er; i >= sr && count <= total; i--) {
//				System.out.print(matrix[i][sc] + " ");
//				count++;
//			}
//			sc++; // Move the left boundary right
//		}
//	}
//}
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

