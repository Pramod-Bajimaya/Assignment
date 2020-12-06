package ClassAssignment;

import java.util.Scanner;

public class Que_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of radius:");
		double r = input.nextDouble();
		System.out.println("Enter the value of height:");
		double h = input.nextDouble();
		double v = 3.141592653589793D * r * r * h;
		System.out.println("=================================");
		System.out.println("Volume of cylinder:" + v);
		input.close();
	}
}