package Lab8;

import java.util.ArrayList;

public class BJP4_Exercise_10_4 {

	public static void doubleList(ArrayList<String> array) {
		int oldSize = array.size();
		
		for (int i = 0; i < oldSize; i++) {
			String a = array.get(2 * i);
			array.add(2 * i, a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
