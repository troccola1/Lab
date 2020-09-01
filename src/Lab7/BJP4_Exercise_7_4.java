package Lab7;

public class BJP4_Exercise_7_4 {
	public boolean isSorted(double[] arr) {
	    for(int i = 0; i <= arr.length - 2; i++) {
	        if(arr[i + 1] < arr[i])
	            return false;
	    }
	    return true;
	}
}
