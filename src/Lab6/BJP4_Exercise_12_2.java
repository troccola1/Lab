package Lab6;

public class BJP4_Exercise_12_2 {

	public static void WriteNums(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		} else if (n == 1) {
			System.out.print("1");
		} else {
			WriteNums(n-1);
			System.out.print(", " + n);
		}
	}
	
	public static void main(String[] args) {
		WriteNums(1);
	}

}
