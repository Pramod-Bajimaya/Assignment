package ClassAssignment;

public class Question36 {
	public static void main(String[] args) {
		String[] arr = new String[]{"pizza", "pasta", "momo", "rumpum", "pasta"};
		boolean flag = false;

		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] == arr[j]) {
					System.out.println("Found duplicate element: " + arr[i]);
					flag = true;
				}
			}
		}

		if (!flag) {
			System.out.println("Duplicate element not found: ");
		}

	}
}