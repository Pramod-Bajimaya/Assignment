package ClassAssignment;

public class Question42 {
	public static void main(String[] args) {
		String words = "Always remember you are braver than you imagine.";
		System.out.println(words);
		String characters = "";
		String duplicates = "";

		for (int i = 0; i < words.length(); ++i) {
			String current = Character.toString(words.charAt(i));
			if (characters.contains(current) && !duplicates.contains(current)) {
				duplicates = duplicates + current + ",";
			}

			characters = characters + current;
		}

		System.out.println(duplicates);
	}
}