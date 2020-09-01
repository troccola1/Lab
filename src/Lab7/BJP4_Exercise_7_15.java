package Lab7;

public class BJP4_Exercise_7_15 {
	
	public static int[] collapse(int[] list) {
	    int length = list.length;
	    int[] newArray;
	    if (length % 2 == 0) {
	        newArray = new int[length / 2];
	    } else {
	        newArray = new int[length / 2 + 1];
	        newArray[length / 2] = list[list.length - 1];
	    }
	    
	    for (int i = 0; i < length / 2; i++) {
	        newArray[i] = list[2 * i] + list[2 * i + 1];
	    } 
	    
	    return newArray;
	}
	
	public static void main(String[] args) {
		
	}

}
