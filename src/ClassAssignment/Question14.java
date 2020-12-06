package ClassAssignment;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		if (a == b) {
			System.out.println("both are equal");
		} else if (a > b) {
			System.out.println("a is greater number");
		} else if (a < b) {
			System.out.println("b is greater number");
		} else {
			System.out.println("null");
		}

		input.close();
	}
}