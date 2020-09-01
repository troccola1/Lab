package Lab8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BJP4_Exercise_10_3 {
	public void removeEvenLength(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String a = list.get(i);
			if (a.length() % 2 == 0) {
				list.remove(i);
				i--;
			}
		}
	}
	
	public static void removeEvenLength(List<String> list) {
	    Iterator<String> iterator = list.iterator();
	    while (iterator.hasNext()) {
	        String word = iterator.next();
	        if (word.length() % 2 == 0) {
	            iterator.remove();
	        }
	    }
	}
	
	public static void main(String[] args) {
		
	}
}
