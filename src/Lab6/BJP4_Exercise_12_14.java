package Lab6;

public class BJP4_Exercise_12_14 {
	
	public static int evenDigits(int n) {
		if(n == 0) {
	        return 0;
		}
	    int last = n % 10;
	    
	    if(last % 2 == 0) {
	        return 10 * evenDigits(n / 10) + last;
	    }
	    return evenDigits(n / 10);
	}

	public static void main(String[] args) {
		System.out.println(evenDigits(8342116));

	}

}
