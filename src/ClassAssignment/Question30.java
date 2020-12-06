package ClassAssignment;

import java.util.Scanner;

public class Question30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter to find Fibonacci: ");
		int n = input.nextInt();
		int first = 1;
		int second = 1;
		System.out.println(first + " ");

		for (int i = 1; i <= n; ++i) {
			System.out.println(second + " ");
			int temp = first + second;
			first = second;
			second = temp;
			input.close();
		}

	}
}