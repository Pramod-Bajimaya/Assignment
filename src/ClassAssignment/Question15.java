package ClassAssignment;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ASCII code:");
		int number = input.nextInt();
		System.out.println("The character for ASCII code " + number + " is " + (char) number);
		input.close();
	}
}