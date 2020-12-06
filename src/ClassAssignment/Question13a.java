package ClassAssignment;

import java.util.Scanner;

public class Question13a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();
		if (n > 0) {
			System.out.printf(" The given number " + n + " is positive ");
		} else if (n < 0) {
			System.out.printf(" The given number " + n + " is negative ");
		} else {
			System.out.printf(" The given number " + n + " is neighter positive nor negative ");
		}

		input.close();
	}
}