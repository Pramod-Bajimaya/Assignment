package ClassAssignment;

import java.util.Scanner;

public class Question11a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b:");
		int b = input.nextInt();
		System.out.println("Before swaping a is: " + a);
		System.out.println("Before swaping b is: " + b);
		System.out.println();
		System.out.println("After swaping a is: " + b);
		System.out.println("After swaping b is: " + a);
		input.close();
	}
}