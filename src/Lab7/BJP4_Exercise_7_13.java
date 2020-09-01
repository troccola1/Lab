package Lab7;

public class BJP4_Exercise_7_13 {
	
	public static int longestSortedSequence(int[] list) { 
	    if (list.length == 0) {
		        return 0;
		    } else {
		        int count = 1;
		        int countMax = 1;
		        
		        for (int i = 0; i < list.length - 1; i++) {
		            if (list[i] <= list[i + 1]) {
		                count++;
		                if (count > countMax) {
		                    countMax = count;
		                }
		            } else {
		                count = 1;
		            }
		        }
		        
		        return countMax;
		    }
	}

	public static void main(String[] args) {

	}

}
