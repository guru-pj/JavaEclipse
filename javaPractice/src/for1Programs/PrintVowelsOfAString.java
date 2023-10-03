package for1Programs;

public class PrintVowelsOfAString {
	public static void main(String[] args) {
		String s = args[0];

		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E'
					|| s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'u') {
				System.out.print(s.charAt(i));
			}
		}
	}
}
