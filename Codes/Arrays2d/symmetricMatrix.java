package Arrays2d;

import java.util.* ;
import java.io.*;

public class symmetricMatrix {
	public static boolean isMatrixSymmetric(int[][] matrix) {
		int N = matrix.length; // Get the matrix size

		// Check symmetry by comparing matrix[i][j] with matrix[j][i]
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {  // Only check the upper triangle, excluding the diagonal
				if (matrix[i][j] != matrix[j][i]) {
					return false; // If any mismatch, return false
				}
			}
		}
		return true; // If all checks pass, matrix is symmetric
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // Number of test cases
		while (T-- > 0) {
			int N = sc.nextInt(); // Matrix size
			int[][] matrix = new int[N][N];

			// Read the matrix elements
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			// Check if the matrix is symmetric
			if (isMatrixSymmetric(matrix)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		sc.close();
	}
}
