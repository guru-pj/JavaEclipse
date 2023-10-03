package day4LMS;

public class MobileUse {
	public static void main(String[] args) {

		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();

		String[] sA1 = args[0].split("#");
		String[] sA2 = args[1].split("#");

		m1.brand = sA1[0];
		m1.price = Integer.parseInt(sA1[1]);
		m1.colour = sA1[2];
		m1.ram = Integer.parseInt(sA1[3]);

		m2.brand = sA2[0];
		m2.price = Integer.parseInt(sA2[1]);
		m2.colour = sA2[2];
		m2.ram = Integer.parseInt(sA2[3]);

		System.out.println(m1.brand + " " + m1.price + " " + m1.colour + " " + m1.ram);
		System.out.println(m2.brand + " " + m2.price + " " + m2.colour + " " + m2.ram);

		System.out.println(m1.price + m2.price);

	}

}
