package day3Test;

public class PenQ12Use {
	public static void main(String[] args) {
		// create instances for 2 pen
		PenQ12 p1 = new PenQ12();// onj for pen1
		PenQ12 p2 = new PenQ12();// obj for pen2

		p1.b = "Reynolds";
		p1.p = 5;
		p1.c = "blue";

		p2.b = "Parker";
		p2.p = 25;
		p2.c = "black";

		// print brand names in upper case
		System.out.println("BrandNames: " + p1.b.toUpperCase() + " " + p2.b.toUpperCase());

		// check for "R"
		System.out.println("does the brandName contains 'R' int it:  " + p1.b.contains("R") + " " + p2.b.contains("R"));

		// check for pen1 colour equals to "BLUE" and pen2 for "black"
		System.out.println(p1.c.contains("BLUE") + " " + p2.c.contains("black"));

		// find charat 4 of pen2colour and charat 2 of pen1 colour
		System.out.println("Pen2 colour Char at index 4 is: " + p2.c.charAt(4));
		System.out.println("Pen1 colour Char at index 2 is: " + p1.c.charAt(2));

		// split brand names
		String[] pA1 = p1.b.split("n");
		String[] pA2 = p2.b.split("r");

		System.out.println("Strings of Array1 is : " + pA1[0] + " and " + pA1[1]);
		System.out.println("Strings of Array2 is : " + pA2[0] + " and " + pA2[1]);

		// length of pen colours
		System.out.println("The length of the pens are : " + p1.c.length() + "  " + p2.c.length());

	}
}
