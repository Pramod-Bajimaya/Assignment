package ClassAssignment;

import java.util.Scanner;

public class Que_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = input.nextInt();
		System.out.println("Enter 2nd number");
		int b = input.nextInt();
		int sum = a + b;
		System.out.println("sum of " + a + " and " + b + " is: " + sum);
		input.close();
		double average = (double) sum / 2.0D;
		System.out.println("average is: " + average);
	}
}