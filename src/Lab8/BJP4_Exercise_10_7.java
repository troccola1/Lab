package Lab8;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class BJP4_Exercise_10_7 {
//  Tham khao
	public void removeDuplicates(ArrayList<String> list) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (String i : list) {
			set.add(i);
		}
		list.clear();
		for (String i : set) {
			list.add(i);
		}
	}

	public static void removeDuplicates1(ArrayList<String> list) {

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).equals(list.get(i + 1))) {
				list.remove(i + 1);
				i--;
			}
		}

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
