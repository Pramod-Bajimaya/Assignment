package ClassAssignment;

import java.util.Scanner;

public class Question17b {
	public static void calculateLeapYear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Year:");
		int year = input.nextInt();
		if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
			System.out.println("specified year is not a leap year. ");
		} else {
			System.out.println("specified year is a leap year.");
		}

		input.close();
	}

	public static void main(String[] args) {
		calculateLeapYear();
	}
}