package for1Programs;

public class Palindrome {
	// after reversing the string it should be equal to the original given string
	public static void main(String[] args) {

		String s = args[0], temp = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
		}
		if (s.equals(temp)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
