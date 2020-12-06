package ClassAssignment;

import java.util.Scanner;

public class Question28_PrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is a prime number: ");
		} else {
			System.out.println(n + " is not a prime number: ");
		}

	}

	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i < n; ++i) {
				if (n % i == 0) {
					return false;
				}
			}

			return true;
		}
	}
}