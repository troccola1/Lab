package Lab8;

import java.util.ArrayList;

public class BJP4_Exercise_10_12 {
	
	public void markLength4(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() == 4) {
				list.add(i, "****");
				i++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
