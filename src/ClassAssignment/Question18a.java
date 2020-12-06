package ClassAssignment;

import java.util.Scanner;

public class Question18a {
	public static void displayLargestNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the largest number: ");
		int n = input.nextInt();
		int n1 = 10;
		int n2 = 12;
		int n3 = 5;
		if (n1 >= n2 && n1 >= n3) {
			System.out.println(n1 + " is the largest Number. ");
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println(n2 + " is the largest Number. ");
		} else {
			System.out.println(n3 + " is the largest Number. ");
		}

		input.close();
	}

	public static void main(String[] args) {
		displayLargestNumber();
		
	}
}