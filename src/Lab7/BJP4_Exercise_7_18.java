package Lab7;

import java.util.Scanner;

public class BJP4_Exercise_7_18 {

	public static void wordLengths(Scanner input) {
		int[] array = new int[81];

		while (input.hasNext()) {
			array[input.next().length()]++;
		}

		for (int i = 1; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.printf("%d: %d\t", i, array[i]);
				for (int j = 0; j < array[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		
	}

}
