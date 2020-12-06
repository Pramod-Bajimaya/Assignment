package ClassAssignment;

import java.util.Scanner;

public class Question34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter an array values: ");

		int temp;
		for (temp = 0; temp < n; ++temp) {
			arr[temp] = input.nextInt();
		}

		int start = 0;

		for (int end = n - 1; start < end; --end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			++start;
		}

		System.out.println("print an array after everse: ");

		for (int j = 0; j < n; ++j) {
			System.out.print(arr[j]);
			input.close();
		}

	}
}