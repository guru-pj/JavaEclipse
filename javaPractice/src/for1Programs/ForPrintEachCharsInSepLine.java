package for1Programs;

public class ForPrintEachCharsInSepLine {
	public static void main(String[] args) {
		String s = "Java";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}
}
