package ClassAssignment;

import java.util.Scanner;

public class Que_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double kg = pounds * 0.454D;
		System.out.println(pounds + " pound is " + kg + " kg ");
		input.close();
	}
}