package Arrays2d;

import java.util.*;

public class coverageOfZero {

	public static int coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
		int n = mat.size();
		int m = mat.get(0).size();
		int totalCoverage = 0;

		// Directions: up, down, left, right
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat.get(i).get(j) == 0) {
					int coverage = 0;
					for (int d = 0; d < 4; d++) {
						int ni = i + dx[d];
						int nj = j + dy[d];
						if (ni >= 0 && ni < n && nj >= 0 && nj < m && mat.get(ni).get(nj) == 1) {
							coverage++;
						}
					}
					totalCoverage += coverage;
				}
			}
		}
		return totalCoverage;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				ArrayList<Integer> row = new ArrayList<>();
				for (int j = 0; j < M; j++) {
					row.add(sc.nextInt());
				}
				mat.add(row);
			}

			int result = coverageOfMatrix(mat);
			System.out.println(result);
		}
		sc.close();
	}
}

