package programs;

//arvks1989@gmail.com
public class PatternPrintSTringABCDEFGHJ {
	public static void main(String[] args) {
		String s = "ABCDEDCBA";
		int j = 0;
		for (int i = s.length(); i >= 0; i--) {
			System.out.println(s.substring(0, s.length() - j));
			j++;
		}
	}
}
