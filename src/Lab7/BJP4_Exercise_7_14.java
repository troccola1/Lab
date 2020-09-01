package Lab7;

public class BJP4_Exercise_7_14 {
	
	public static boolean contains(int[] a1, int[] a2) {
	    for (int i = 0; i <= a1.length - a2.length; i++) {
	        int count = 0;
	        
	        for (int j = 0; j < a2.length; j++) {   
	            if (a2[j] == a1[i + j]) {
	                count++;
	            }
	        }
	        
	        if (count == a2.length) {
	            return true;
	        }
	    }
	    
	    return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
