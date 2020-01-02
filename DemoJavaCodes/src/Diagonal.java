
public class Diagonal {

	public static void main(String[] args) {
		int[][] matrixA = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j) {
					System.out.print(matrixA[i][j] + " ");
				} else {
					System.out.print("0" + " ");
				}
			}
			System.out.println();
		}
	}
}
