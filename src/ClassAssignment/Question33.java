package ClassAssignment;

import java.util.Scanner;

public class Question33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements you want in the array: ");
		int count = input.nextInt();
		int[] num = new int[count];
		System.out.println("Enter array elements:");

		int i;
		for (i = 0; i < count; ++i) {
			num[i] = input.nextInt();
		}

		input.close();

		for (i = 0; i < count; ++i) {
			for (int j = i + 1; j < count; ++j) {
				if (num[i] > num[j]) {
					count = num[i];
					num[i] = num[j];
					num[j] = count;
				}
			}
		}

		System.out.print("Array Elements in Ascending Order: ");

		for (i = 0; i < count - 1; ++i) {
			System.out.print(num[i] + " ");
		}

		System.out.print(num[count - 1]);
	}
}