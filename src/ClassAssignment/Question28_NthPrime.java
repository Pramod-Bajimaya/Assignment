

package ClassAssignment;
import java.util.Scanner;
public class Question28_NthPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = input.nextInt();
		
		int i = 0;
		int num = 0;
		String primeNumbers = "";
		
		for (i = 1; i <= n; i++); {
			
			int counter = 0;
			for (num = i; num >= 1; num --) {
				
				if (i % num == 0) {
			
			    counter = counter + 1;
	  }
	}
		if (counter == 2) {
			
			primeNumbers = primeNumbers + i + "";			
			
		}
		   System.out.println("Prime numbers from 1 to n are:  ");
		   System.out.println("primeNumbers: ");
		}	
	}
}
