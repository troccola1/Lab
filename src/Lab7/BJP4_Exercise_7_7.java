package Lab7;

public class BJP4_Exercise_7_7 {
	public static int kthlargest(int k, int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[i];
					a[j] = temp;
				}
			}
		}
		return a[k];
 	}
	
}
