package day3Test;

public class LaptopQ11Use {
	public static void main(String[] args) {
		LaptopQ11 l1 = new LaptopQ11(); // create an object for a laptop

		l1.b = "Dell";
		l1.p = 40000;
		l1.c = "Silver";
		l1.isW = true;

		// convert brand to uppercase
		String s = l1.b.toUpperCase();
		System.out.println(s);

		// check if it starts with D
		System.out.println(l1.b.startsWith("D"));

		// find the last char
		System.out.println(l1.b.charAt(l1.b.length() - 1));

		// covert brand to lower case
		System.out.println(l1.b.toLowerCase());

	}
}
