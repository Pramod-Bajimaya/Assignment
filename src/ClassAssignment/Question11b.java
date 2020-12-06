package ClassAssignment;

import java.util.Scanner;

public class Question11b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		System.out.println("Before swaping a is: " + a);
		System.out.println("Before swaping b is: " + b);
		a += b;
		b = a - b;
		a -= b;
		System.out.println();
		System.out.println("Afre swaping a is: " + a);
		System.out.println("Afterswaping a is: " + b);
		input.close();
	}
}