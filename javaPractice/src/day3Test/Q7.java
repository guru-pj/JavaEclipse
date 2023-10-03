package day3Test;

public class Q7 {

	public static void main(String[] args) {

		String s = "Java,PYTHON,C++";
		String[] sA = s.split(",");
		// find length of each string
		System.out.println("Length of all Strings is :" + sA[0].length() + " " + sA[1].length() + " " + sA[2].length());

		// covrt them to lowercase
		String s1 = sA[0].toLowerCase();
		String s2 = sA[1].toLowerCase();
		String s3 = sA[2].toLowerCase();
		System.out.println(s1 + " " + s2 + " " + s3);

	}
}
