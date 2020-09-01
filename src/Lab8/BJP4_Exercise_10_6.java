package Lab8;

import java.util.ArrayList;

public class BJP4_Exercise_10_6 {
	
	public static void minToFront(ArrayList<Integer> list) {
	    int min = 0;
	    
	    for (int i = 1; i < list.size(); i++) {
	        if (list.get(min) > list.get(i)) {
	            min = i;
	        }
	    }
	    
	    int minValue = list.remove(min);
	    list.add(0, minValue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
