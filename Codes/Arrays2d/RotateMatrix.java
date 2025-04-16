package Arrays2d;
import java.util.Scanner;

public class RotateMatrix {

	public static void inplaceRotate(int[][] arr, int n) {
		// Step 1: Transpose the matrix
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		// Step 2: Reverse each column
		for (int col = 0; col < n; col++) {
			int top = 0, bottom = n - 1;
			while (top < bottom) {
				int temp = arr[top][col];
				arr[top][col] = arr[bottom][col];
				arr[bottom][col] = temp;
				top++;
				bottom--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // Number of test cases

		while (t-- > 0) {
			int n = sc.nextInt(); // Size of matrix (n x n)
			int[][] matrix = new int[n][n];

			// Input matrix
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					matrix[i][j] = sc.nextInt();

			// Perform in-place rotation
			inplaceRotate(matrix, n);

			// Output rotated matrix
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		}

		sc.close();
	}
}
