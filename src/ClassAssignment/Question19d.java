package ClassAssignment;

import java.util.Scanner;

public class Question19d {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side a: ");
		int sideA = input.nextInt();
		System.out.println("Enter side b: ");
		int sideB = input.nextInt();
		System.out.println("Enter side c: ");
		int sideC = input.nextInt();
		if (sideA + sideB >= sideC && sideA + sideC >= sideB && sideC + sideB >= sideA) {
			if (sideA > 0 && sideB > 0 && sideC > 0) {
				if (sideA == sideB && sideA == sideC) {
					System.out.println("Equilateral triangle ");
				} else if (sideA != sideB && sideA != sideC && sideB != sideC) {
					System.out.println("Scalene triangle. ");
					input.close();
				} else {
					System.out.println("Isoceles triangle. ");
				}
			} else {
				System.out.println("Invalid triangle ");
			}
		} else {
			System.out.println("Invalid triangle ");
		}

	}
}