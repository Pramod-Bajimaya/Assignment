package ClassAssignment;

import java.util.Scanner;

public class Question43 {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array elements:");

		int i;
		for (i = 0; i < 5; ++i) {
			a[i] = input.nextInt();
		}

		try {
			for (i = 0; i < 10; ++i) {
				try {
					int b = a[i] / a[i + 1];
					System.out.println(b);
				} catch (ArithmeticException var5) {
					System.out.println("Arithmetic Exception: " + var5);
				}
			}
		} catch (ArrayIndexOutOfBoundsException var6) {
			var6.printStackTrace();
		}

	}
}