package Lab8;

import java.util.ArrayList;

public class BJP4_Exercise_10_17 {
	public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
		int size = a1.size();
		
		if (a1.size() > a2.size()) {
			size = a2.size();
		}
		
		int i = 0;
		for (i = 0; i < size; i++) {
			a1.add(i * 2 + 1, a2.get(i));
		}
		
		if (i < a2.size()) {
			for (int j = 1; j < a2.size(); j++) {
				a1.add(a2.get(j));
			}
		}
	}
}
