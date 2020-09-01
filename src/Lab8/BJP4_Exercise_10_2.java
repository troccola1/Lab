package Lab8;

import java.util.ArrayList;

public class BJP4_Exercise_10_2 {
	
	public static void swapPairs(ArrayList<String> list) {
		int size = list.size();
		if (list.size() % 2 != 0) {
			size = list.size() - 1;
		}
		
		for (int i = 0; i < size - 1; i+= 2) {
			String temp = list.get(i);
			list.set(i,  list.get(i + 1));
			list.set(i + 1, temp);
		}
	}

}
