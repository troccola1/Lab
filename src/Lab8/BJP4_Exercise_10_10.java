package Lab8;

import java.util.ArrayList;

public class BJP4_Exercise_10_10 {
	
	public static void removeInRange(ArrayList<Integer> list, int value, int min, int max) {
		for (int i = min; i < max; i++) {
			if (list.get(i) == value) {
				list.remove(i);
				i--;
				max--;
				min--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
