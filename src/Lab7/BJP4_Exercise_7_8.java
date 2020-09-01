package Lab7;

public class BJP4_Exercise_7_8 {
	public static int median(int[] a) {
		int[] spareArray = new int[100];

		for (int i = 0; i < a.length; i++) {
			spareArray[a[i]]++;
		}
		int sum = 0;

		for (int i = 0; i < spareArray.length; i++) {
			sum += spareArray[i];
			if (sum == a.length / 2 + 1) {
				return i;
			}
		}

		return -1;
	}
}
