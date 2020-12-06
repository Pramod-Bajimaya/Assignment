package ClassAssignment;

public class Question40_RevStr {
	public static void main(String[] args) {
		String s = "Shivaji";
		String s2 = new String();
		System.out.println(s2);
		String s3 = new String("Shivaji");
		System.out.println(s3);
		char[] ch = new char[]{'S', 'h', 'i', 'v', 'a', 'j', 'i'};
		String s4 = new String(ch);
		System.out.println(s4);
		byte[] bb = new byte[]{83, 104, 105, 118, 97, 106, 105};
		String s5 = new String(bb);
		System.out.println(s5);
		String reverse = (new StringBuffer(s)).reverse().toString();
		System.out.println("String before reverse: " + s);
		System.out.println("String after reverse: " + reverse);
	}
}