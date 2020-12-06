package ClassAssignment;

import java.util.Scanner;

public class Question21bb {
	public static void main(String[] args) {
		Scanner input;
		label39 : {
			input = new Scanner(System.in);
			System.out.println("Enter the variety of foods");
			String choice = input.next();
			switch (choice.hashCode()) {
				case 3383 :
					if (choice.equals("ja")) {
						System.out.println("This is gulab jamun.");
						break label39;
					}
					break;
				case 3387 :
					if (choice.equals("je")) {
						System.out.println("This is jerry swari.");
						break label39;
					}
					break;
				case 3490 :
					if (choice.equals("mo")) {
						System.out.println("This is momo.");
						break label39;
					}
					break;
				case 3584 :
					if (choice.equals("pp")) {
						System.out.println("This is pani puri.");
						break label39;
					}
					break;
				case 97547 :
					if (choice.equals("bir")) {
						System.out.println("This is chicken biryani.");
						break label39;
					}
					break;
				case 113631 :
					if (choice.equals("sam")) {
						System.out.println("This is samosa.");
						break label39;
					}
					break;
				case 3052811 :
					if (choice.equals("chou")) {
						System.out.println("This is choumin.");
						break label39;
					}
			}

			System.out.println("This is not in Menu.");
		}

		System.out.println(" more more more more code...");
		System.out.println("more more code..");
		System.out.println("End of the Program.");
		input.close();
	}
}