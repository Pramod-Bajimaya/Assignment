package ClassAssignment;

import java.util.Scanner;

public class Que_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Redius of circle:");
		double r = input.nextDouble();
		double p1 = 6.283185307179586D * r;
		System.out.println("Enter the three sides of triangle:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double p2 = a + b + c;
		System.out.println("Enter the length of rectangular:");
		double l = input.nextDouble();
		System.out.println("Enter the width of rectangular:");
		double w = input.nextDouble();
		double p3 = 2.0D * (l + w);
		System.out.println("Perimeter of circle : " + p1);
		System.out.println("Perimeter of triangle : " + p2);
		System.out.println("Perimeter of rectangle : " + p3);
		input.close();
	}
}