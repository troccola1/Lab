package Lab6;

public class BJP4_Exercise_12_1 {
	
	public static String starString(int n) {
		if(n < 0) {
			throw new IllegalArgumentException();
		} if (n == 0) {
			return "*";
		}
		return starString(n-1) + starString(n-1);
	}

	public static void main(String[] args) {
		System.out.println(starString(3));
	}

}
