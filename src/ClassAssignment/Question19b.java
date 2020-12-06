package ClassAssignment;

import java.util.Scanner;

public class Question19b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the length of three sides of triangle: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		if (x == y && x == z && y == z) {
			System.out.println("This is an Equilateral triangle:");
		} else if (x != y && x != z && y != z) {
			System.out.println("This is Scalene triangle: ");
		} else {
			System.out.println("This is an Isoceles triangle: ");
		}

		input.close();
	}
}