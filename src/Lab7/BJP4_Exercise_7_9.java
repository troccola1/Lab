package Lab7;

public class BJP4_Exercise_7_9 {
	
	public static int minGap(int[] list) {
		if (list.length < 2) {
	        return 0;
	    } else {
	        int min = list[1] - list[0];
	        for (int i = 1; i < list.length - 1; i++) {
	            int gap = list[i] - list[i - 1];
	            if (gap < min) {
	                min = gap;
	            }
	        }
	        return min;
	    }
	}

	public static void main(String[] args) {
		int[] list = {2,4,6};
		System.out.println(minGap(list));
	}

}
