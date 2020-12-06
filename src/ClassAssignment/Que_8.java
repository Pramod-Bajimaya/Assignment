package ClassAssignment;

import java.util.Scanner;

public class Que_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in degree fehrenheit:");
		double f = input.nextDouble();
		double c = (f - 32.0D) / 1.8D;
		System.out.println("Temperature in Degree celcius:" + c);
		System.out.println("Enter the temprayure in degree celcius:");
		double c1 = input.nextDouble();
		double f2 = c1 * 1.8D + 32.0D;
		System.out.println("Temperature in degree fahrenheight:" + f2);
		input.close();
	}
}