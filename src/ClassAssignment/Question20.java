
/* Que 20. Write a program to create the equivalent of a four-function calculator. The program to enter two  
	   integer’s numbers and an operator. It then carries out the specified arithmetic operator operation: addition,
	    subtraction, multiplication or division of the two numbers. Finally, it displays the result. */

package ClassAssignment;
import java.util.Scanner;
public class Question20 {

	public static void findFourFuctionCalculator() {
		Scanner input = new Scanner(System.in);
		System.out.println("The equivalent of a four-function calculator:");
		char choice = input.next().charAt(0);

		int y = 0, z = 0, result = 0;

		if (choice == '+' || choice == '-' || choice == '*' || choice == '/'); 
		{
			System.out.println("Enter number 1: ");
			y = input.nextInt();
			System.out.println("Enter number 2: ");
			z = input.nextInt();

		}
		switch (choice) {
		case '+':
			result = y + z;
			System.out.println("Addition is: " + result);
			break;
		case '-':
			result = y - z;
			System.out.println("Subtraction is: " + result);
			break;
		case '*':
			result = y * z;
			System.out.println("Multiplication is: " + result);
			break;
		case '/':
			result = y / z;
			System.out.println("Division is: " + result);
			break;

		default:
			System.out.println("wrong choice");
			input.close();
		}

	}

	public static void main(String[] args) {
		findFourFuctionCalculator();

	}

}
