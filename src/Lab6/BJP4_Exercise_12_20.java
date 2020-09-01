package Lab6;

import java.util.List;

public class BJP4_Exercise_12_20 {
	
	public void subsets(List<String> list) {
	    subsets(list, 0, list.size());
	}

	public void subsets(List<String> list, int start, int rem) {
	    if(rem == 0) {
	        System.out.println(list);
	        return;
	    }
	    
	    subsets(list, start + 1, rem - 1);
	    String str = list.remove(start);
	    subsets(list, start, rem - 1);
	    list.add(start, str);
	}
}
