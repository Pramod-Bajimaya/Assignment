package ClassAssignment;

import java.util.Scanner;

public class Question29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of terms in series:");
		int n = input.nextInt();
		double sum = 0.0D;

		for (int i = 0; i <= n; ++i) {
			double fact = Question24.factorial(i);
			sum += 1.0D / fact;
		}

		System.out.println("Sum of series: " + sum);
		input.close();
	}
}