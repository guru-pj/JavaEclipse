package day3Test;

public class Q9 {
	public static void main(String[] args) {
		String s = "Fantasy program";
		// check if it starts with F
		System.out.println(s.startsWith("F"));

		// check if it ends with s
		System.out.println(s.endsWith("s"));

		// find length
		System.out.println(s.length());

		// find the last second character
		System.out.println(s.charAt(s.length() - 2));
	}

}
