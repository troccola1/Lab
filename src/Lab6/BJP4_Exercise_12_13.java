package Lab6;

public class BJP4_Exercise_12_13 {
	
	public static int indexOf(String a, String b) {
		if (a.length() == b.length()) {
			if (a.equals(b)) {
				return 0;
			}
		} else if (a.length() >= b.length()) {
			int length = b.length();
			if (a.substring(0, length).contentEquals(b)) {
				return 0;
			} else {
				int result = 1 + indexOf(a.substring(1), b);
				if (result != 0) {
					return result;
				}
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		System.out.println(indexOf("Barack Obama", "Bar"));

	}

}
