package day3Test;

public class Q14Array {
	public static void main(String[] args) {
		String s = "World Wide Wonder"; // given string
		String[] sA = s.split(" "); // splitting and saving it to the String Array

		// find length of the each strings
		System.out.println(
				"Length of the each Strings are : " + sA[0].length() + " " + sA[1].length() + " " + sA[2].length());

		// convert each string to uppercase
		System.out.println("UpperCased Strings Are : " + sA[0].toUpperCase() + " " + sA[1].toUpperCase() + " "
				+ sA[2].toUpperCase());

		// add string "programs" to the given string
		System.out.println(s + " programs");

		// how can we add string to another string
		// sA[3] = " programs"; //trying to add to the string array

	}

}
