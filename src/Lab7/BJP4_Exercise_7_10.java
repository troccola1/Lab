package Lab7;

public class BJP4_Exercise_7_10 {
	
	public double percentEven(int[] list) {
	    if(list.length == 0)
	        return 0.0;
	        
	    int count = 0;
	    
	    for(int i = 0; i < list.length; i++) {
	        if(list[i] % 2 == 0)
	            count++;
	    }
	    
	    return count * 100.0 / list.length;
	}
	
//	public static void main(String[] args) {
//		int[] list = {6, 2, 9, 11, 3};
//		System.out.println(percentEven(list));
//	}
	
}
