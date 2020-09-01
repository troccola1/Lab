package Lab6;

public class BJP4_Exercise_12_7 {
	
	public static void writeChars(int n) {
		if (n < 1) {
	        throw new IllegalArgumentException();
	    } else if (n == 1) {
	        System.out.print("*");
	    } else if (n == 2) {
	        System.out.print("**");
	    } else {
	        System.out.print("<");
	        writeChars(n - 2);
	        System.out.print(">");
	    }
	}

	public static void main(String[] args) {
		writeChars(7);
	}

}
