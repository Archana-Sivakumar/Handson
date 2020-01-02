
public class MatrixMultiplication {

	public static void main(String[] args) {
		int i, j, k;
		int[][] matrixA = { { 1, 2 }, { 3, 4 } };
		int[][] matrixB = { { 1, 1 }, { 2, 2 } };
		int[][] matrixC = new int[2][2];
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				matrixC[i][j] = 0;
				for (k = 0; k < 2; k++) {
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(matrixC[i][j] + " ");
			}
			System.out.println();
		}
	}
}
