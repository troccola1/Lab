package Lab6;

public class BJP4_Exercise_12_10 {
	
	public static int digitMatch(int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException();
		} else if (x == 0 && y == 0) {
			return 1;
		} else {
			int result = 0;
			if (x % 10 == y % 10) {
			result++;
		}
		if (x / 10 == 0 || y / 10 == 0) {
			return result;
		}
			return result + digitMatch(x / 10, y / 10);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(digitMatch(123456, 654321));
	}
}
