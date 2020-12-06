package ClassAssignment;

import java.util.Scanner;

public class Question13b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int n = input.nextInt();
		if (n < 0) {
			System.out.println(" negative number." + n);
		}

		System.out.println("more code");
		System.out.println("exit");
		input.close();
	}
}