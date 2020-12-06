package ClassAssignment;

import java.util.Scanner;

public class Que_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principal:");
		double p = input.nextDouble();
		System.out.println("Enter time: ");
		double t = input.nextDouble();
		System.out.println("Enter rate: ");
		double r = input.nextDouble();
		double si = p * t * r / 100.0D;
		System.out.println("Simple interest is: " + si);
		System.out.println("Enter P:");
		int p1 = input.nextInt();
		System.out.println("Enter t");
		int t1 = input.nextInt();
		System.out.println("Enter r");
		int r1 = input.nextInt();
		int si1 = p1 * t1 * r1 / 100;
		System.out.println("Simple Interest is :" + si1);
		input.close();
	}
}