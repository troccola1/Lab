package Lab8;

import java.util.ArrayList;

public class BJP4_Exercise_10_14 {
	public void removeShorterStrings(ArrayList<String> list) {
		int ab = list.size();
		for (int i = 0; i < ab / 2; i++) {
			int a = list.get(i).length();
			int b = list.get(i + 1).length();
			if (a > b) {
				list.remove(i + 1);
			} else {
				list.remove(i);
			}
		}
	}
}
