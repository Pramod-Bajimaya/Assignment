package ClassAssignment;

import java.util.Scanner;

public class Question22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = input.nextInt();
		System.out.println("Table of Multiplication: " + n);

		for (int i = 1; i <= 20; ++i) {
			System.out.println(n + " X " + i + " = " + n * i);
		}

		input.close();
	}
}