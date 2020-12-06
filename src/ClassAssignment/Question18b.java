package ClassAssignment;

import java.util.Scanner;

public class Question18b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the first number:");
		int x = input.nextInt();
		System.out.println(" Enter the second number:");
		int y = input.nextInt();
		System.out.println(" Enter the third number:");
		int z = input.nextInt();
		if (x > y && x > z) {
			System.out.println("Largest number is: " + x);
		} else if (y > z) {
			System.out.println("Largest number is: " + y);
		} else {
			System.out.println(" Largest number is: " + z);
		}

		input.close();
	}
}