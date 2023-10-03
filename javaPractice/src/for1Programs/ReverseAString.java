package for1Programs;

public class ReverseAString {
	public static void main(String[] args) {
		String s = args[0], temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
			// System.out.print(s.charAt(i));

		}
		System.out.println(temp);
	}
}
