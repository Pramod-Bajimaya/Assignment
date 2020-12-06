package ClassAssignment;

import java.util.Scanner;

public class Question21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter day name:");
		int day = input.nextInt();
		switch (day) {
			case 1 :
				System.out.println("Sunday.");
				break;
			case 2 :
				System.out.println("Monday.");
				break;
			case 3 :
				System.out.println("Tuesday.");
				break;
			case 4 :
				System.out.println("Wednsday.");
				break;
			case 5 :
				System.out.println("Thursday.");
				break;
			case 6 :
				System.out.println("Friday.");
				break;
			case 7 :
				System.out.println("Saturday.");
				break;
			default :
				System.out.println(" Wrong day choice!!! ");
				input.close();
		}

	}
}