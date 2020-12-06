package ClassAssignment;

import java.util.Scanner;

public class Question19a {
	public static void findKindsOfTriangleIsFormed() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enetr the sides of triangle:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if (a == b && b == c && a == c) {
			System.out.println("This is an Equilateral triangle. ");
		} else if (a != b && b != c && a != c) {
			System.out.println("This is Scalene triangle. ");
			input.close();
		} else {
			System.out.println("This is an Isoles triangle. ");
		}

	}

	public static void main(String[] args) {
		findKindsOfTriangleIsFormed();
	}
}