package ClassAssignment;

public class Question37 {
	public static void main(String[] args) {
		int[][] matrixA = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrixB = new int[][]{{4, 5, 6}, {2, 7, 8}, {3, 1, 9}};
		int ROW = 3;
		int COLUMN = 3;
		int[][] result = new int[3][3];
		System.out.println("The resultant matrix is: ");

		int i;
		int j;
		for (i = 0; i < ROW; ++i) {
			for (j = 0; j < COLUMN; ++j) {
				result[i][j] = matrixA[i][j] + matrixB[i][j];
			}

			System.out.println();
		}

		for (i = 0; i < result.length; ++i) {
			for (j = 0; j < result.length; ++j) {
				System.out.println(result[i][j] + " ");
			}
		}

		System.out.println();
	}
}