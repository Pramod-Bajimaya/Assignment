package ClassAssignment;

import java.util.Scanner;

public class Question16a {
	public static void findEvenOrOddNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the number to find even or odd:");
		int n = input.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is an even number. ");
		} else {
			System.out.println(n + " is an odd number.");
		}

		input.close();
	}

	public static void main(String[] args) {
		System.out.println("main");
		findEvenOrOddNumber();
		System.out.println("end");
	}
}