package Lab7;

public class BJP4_Exercixe_7_5 {
	public static int mode(int[] a) {
	    int[] spareArray = new int[101];
	    
	    for (int i = 0; i < a.length; i++) {
	        spareArray[a[i]]++;
	    }
	    
	    int mode = 101;
	    int count = 0;
	    
	    for (int i = 0; i < spareArray.length; i++) {
	        if (spareArray[i] > count) {
	            count = spareArray[i];
	            mode = i;
	        }
	    }
	    
	    return mode;
	}
}
