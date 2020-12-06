package ClassAssignment;

import java.util.Scanner;

public class Question16b {
	public static void main(String[] args) {
		Scanner pramod = new Scanner(System.in);
		System.out.println("Enter the number to find odd or even:");
		int n = pramod.nextInt();
		if (n % 2 == 0) {
			System.out.println("The given number " + n + " is an even");
		} else {
			System.out.println("The given number " + n + " is an odd");
		}
pramod.close();
	}
}