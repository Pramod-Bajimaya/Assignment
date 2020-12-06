package ClassAssignment;

import java.util.Scanner;

public class Question26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int originalNumber = input.nextInt();
		int reverseNumber = 0;
		System.out.println("Original number is: " + originalNumber);

		while (originalNumber != 0) {
			int temp = originalNumber % 10;
			reverseNumber = reverseNumber * 10 + temp;
			originalNumber /= 10;
		}

		System.out.println("Reversed number is: " + reverseNumber);
		input.close();
	}
}