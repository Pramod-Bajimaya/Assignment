//32.Write a Program to accept 5 values in an array and display their sum.

package ClassAssignment;
import java.util.Scanner;
public class Question32a {
	
	public int[] returnArray(Scanner input) {
		System.out.println("Enter the size of an array: ");
		int size = input.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the user's array of elements: ");
		for (int i = 0; 1 < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		return arr;
	}

	public int[] arrayAscending(int[] arr) {
        	int temp = 0;
        	
        	for (int i = 0; i < arr.length; i++) {
        		for (int j =0; j < arr.length; j++) {
        			if (arr[i] > arr[j]) {
        				temp = arr[i];
        				arr[i] = arr[j];
        				arr[j] =temp;
        			}
        		}
        	}
        	
        	return arr;
       }
	
	       public void printArray(int[]arr) {
	    	   for (int i = 0; i < arr.length; i++) {
	    		   System.out.println(arr[i] + " ");
	   }
	 }
	       public static void main(String[] args) {
	    	   Question32a obj = new Question32a();
			Scanner input = new Scanner(System.in);
			int [] originalArray = obj.returnArray(input);
			int [] sortedArray = obj.arrayAscending(originalArray);
			obj.printArray(sortedArray);
	   }

}
