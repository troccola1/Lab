package Lab7;

public class BJP4_Exercise_7_19 {

	public static int[][] matrixAdd(int[][] a, int[][] b) {
		if (a.length == 0 || b.length == 0) {
			return new int[0][0];
		} else {
			int[][] result = new int[a.length][a[0].length];

			for (int i = 0; i < result.length; i++) {

				for (int j = 0; j < result[0].length; j++) {
					result[i][j] = a[i][j] + b[i][j];
				}

			}

			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
