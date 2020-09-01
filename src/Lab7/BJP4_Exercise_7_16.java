package Lab7;

public class BJP4_Exercise_7_16 {
	
	public int[] append(int[] list1, int[] list2) {
	    int[] a = new int[list1.length + list2.length];
	    int i = 0;
	    
	    for(int j = 0; j < list1.length; j++) {
	        a[i] = list1[j];
	        i++;
	    }
	    
	    for(int j = 0; j < list2.length; j++) {
	        a[i] = list2[j];
	        i++;
	    }
	    
	    return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
