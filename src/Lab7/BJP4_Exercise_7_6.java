package Lab7;

public class BJP4_Exercise_7_6 {

	public double stdev(int[] a) {
		double avg = 0;
		double num = 0;

		for (int i = 0; i < a.length; i++) {
			avg += a[i];
		}

		avg /= a.length;

		for (int i = 0; i < a.length; i++) {
			num += (a[i] - avg) * (a[i] - avg);
		}

		return Math.sqrt(num / (a.length - 1));
	}

	public static void main(String[] args) {

	}
}
