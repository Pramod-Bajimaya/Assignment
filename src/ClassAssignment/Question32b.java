package ClassAssignment;

import java.util.Scanner;

public class Question32b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];
		int[] array = new int[]{1, 2, 3, 4, 5};
		int sum = 0;
		int[] var8 = array;
		int var7 = array.length;

		for (int var6 = 0; var6 < var7; ++var6) {
			int i = var8[var6];
			sum += i;
		}

		System.out.println("The sum is: " + sum);
		input.close();
	}
}