package Lab6;

public class BJP4_Exercise_12_12 {
	public static boolean isReverse(String s1, String s2) {
		if(s1.length() == 0 && s1.length() == 0) {
			return true;
		} else if (s1.length() == s2.length()) {
			int length = s1.length();
			char l1 = Character.toUpperCase(s1.charAt(0));
			char l2 = Character.toUpperCase(s2.charAt(length - 1));
			if (l1 == l2) {
				return isReverse(s1.substring(1), s2.substring(0, length - 1));
			} else {
				return false;
			}
		}
		return false;
	}

	
	public static void main(String[] args) {
		System.out.println(isReverse("Madam", "maDAm"));
	}
}
