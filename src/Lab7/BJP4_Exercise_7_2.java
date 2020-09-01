package Lab7;

public class BJP4_Exercise_7_2 {

	public static int range(int[] a) {
		int min = a[0];
	    int max = a[0];
	    
	    for (int i = 1; i < a.length; i++) {
	        min = Math.min(min, a[i]);
	        max = Math.max(max, a[i]);
	    }
	    
	    return max - min + 1;
	}

}
	