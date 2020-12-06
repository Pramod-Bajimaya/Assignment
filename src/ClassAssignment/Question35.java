package ClassAssignment;

public class Question35 {
	public static int findSecondLargest(int[] arr, int size) {
		boolean temp = false;

		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] > arr[j]) {
					int temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}
			}
		}

		return arr[size - 2];
	}

	public static void main(String[] args) {
		int[] arr = new int[]{4, 6, 8, 2, 5, 11, 15};
		System.out.println("Second Largest number is: " + findSecondLargest(arr, 6));
	}
}