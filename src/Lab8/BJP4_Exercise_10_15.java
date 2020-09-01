package Lab8;

import java.util.ArrayList;

public class BJP4_Exercise_10_15 {
	public static void filterRange(ArrayList<Integer> list, int min, int max) {
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			if (num <= max && num >= min) {
				list.remove(i);
				i--;
			}
		}
	}
}
