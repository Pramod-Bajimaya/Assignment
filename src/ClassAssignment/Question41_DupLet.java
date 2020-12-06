package ClassAssignment;

public class Question41_DupLet {
	public static void main(String[] args) {
		String s = "Santosh Lal Karna is an awesome teacher";
		char[] chararr = s.toCharArray();
		System.out.println("The string is:" + s);
		System.out.print("Duplicate letters in above string are: ");

		for (int i = 0; i < s.length(); ++i) {
			for (int j = i + 1; j < s.length(); ++j) {
				if (chararr[i] == chararr[j]) {
					System.out.print(chararr[j] + " ");
					break;
				}
			}
		}

	}
}