package Lab7;

public class BJP4_Exercise_7_1 {
	
	public static int lastIndexOf(int[] a, int target) {
		for (int i = a.length - 1; i >= 0; i--) {
	        if (a[i] == target) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
	
}
