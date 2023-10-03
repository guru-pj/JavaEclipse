package day3;

public class charAt {
	public static void main(String[] args) {
		String s = "Guru Moorthy";

		char c = s.charAt(0);
		System.out.println(c);

		System.out.println(s.charAt(5));
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(11));
		// System.out.println(s.charAt(12)); // out of index boundry

	}
}
