package Lab7;

public class BJP4_Exercise_7_11 {
	public static boolean isUnique(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				return false;
			}
		}
		return true;
	}
}
