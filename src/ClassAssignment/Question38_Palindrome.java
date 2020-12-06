package ClassAssignment;

public class Question38_Palindrome {
	public static void main(String[] args) {
		String s = "nitin";
		int start = 0;
		int end = s.length() - 1;

		boolean isPalindrome;
		for (isPalindrome = true; start < end; --end) {
			if (s.charAt(start) != s.charAt(end)) {
				isPalindrome = false;
				break;
			}

			++start;
		}

		if (isPalindrome) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not a palindrome String");
		}

	}
}