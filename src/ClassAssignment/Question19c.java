package ClassAssignment;

import java.util.Scanner;

public class Question19c {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side a: ");
		int sideA = input.nextInt();
		System.out.println("Enter side b: ");
		int sideB = input.nextInt();
		System.out.println("Enter side c: ");
		int sideC = input.nextInt();
		if (sideA == sideB && sideA == sideC) {
			System.out.println("Equilateral triangle. ");
		} else if (sideA != sideB && sideA != sideC && sideB != sideC) {
			System.out.println("Scalene triangle. ");
		} else {
			System.out.println("Isoceles triangle. ");
		}

		input.close();
	}
}