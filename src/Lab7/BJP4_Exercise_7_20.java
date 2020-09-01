package Lab7;

public class BJP4_Exercise_7_20 {

	public boolean isMagicSquare(int[][] a) {
		if(a.length == 0) {
	        return true;
	    }
		
		int magicNumber = 0;
		for (int j = 0; j < a[0].length; j++) {
			magicNumber += a[0][j];
		}

		for (int i = 0; i < a.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < a[i].length; j++) {
				rowSum += a[i][j];
			}
			if (rowSum != magicNumber) {
				return false;
			}
		}

		for (int i = 0; i < a.length; i++) {
			int rowSum = 0;
			int colSum = 0;
			for (int j = 0; j < a[i].length; j++) {
				rowSum += a[i][j];
				colSum += a[j][i];
			}
			if (rowSum != magicNumber || colSum != magicNumber) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
