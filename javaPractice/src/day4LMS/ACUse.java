package day4LMS;

public class ACUse {
	public static void main(String[] args) {

		AC a1 = new AC(); // object creation for AC1

		String[] s = args[0].split("-");

		a1.brand = s[0];
		a1.price = Integer.parseInt(s[1]);
		a1.colour = s[2];
		a1.rating = Float.parseFloat(s[3]);

		System.out.println(a1.brand);
		System.out.println(a1.price);
		System.out.println(a1.colour);
		System.out.println(a1.rating);

	}

}
