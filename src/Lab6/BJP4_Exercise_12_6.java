package Lab6;

public class BJP4_Exercise_12_6 {
	
	public static void writeSquares(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		} else if (n == 1) {
			System.out.print("1");
		} else if (n % 2 == 0) {
			writeSquares(n-1);
			System.out.print(", " + n * n);
		} else {
			System.out.print(n * n + ", ");
			writeSquares(n-1);
		}
	}

	public static void main(String[] args) {
		writeSquares(8);

	}

}
