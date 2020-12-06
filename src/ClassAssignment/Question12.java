package ClassAssignment;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = input.nextLine();
		System.out.println("Enter Mailing address: ");
		String mailing = input.nextLine();
		System.out.println("Enter county: ");
		String age = input.next();
		System.out.println("=============================");
		System.out.println("Name is:" + name);
		System.out.println("Mailing address is:" + mailing);
		System.out.println("County is:" + age);
		System.out.println("=============================");
		input.close();
	}
}