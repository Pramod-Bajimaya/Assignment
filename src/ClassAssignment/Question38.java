package ClassAssignment;

public class Question38 {
	public static void main(String[] args) {
		String s = "sabas";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; --i) {
			rev = rev + s.charAt(i);
		}

		if (s.equals(rev)) {
			System.out.println("This is a Palindrome String.");
		} else {
			System.out.println("This is not a Palindrome String.");
		}

	}
}