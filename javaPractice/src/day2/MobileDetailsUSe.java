package day2;

public class MobileDetailsUSe {
	public static void main(String[] args) {

		MobileDetails m1 = new MobileDetails(); // instantiation for mobile1
		MobileDetails m2 = new MobileDetails(); // instantiation for mobile2

		m1.brand = "Apple";
		m1.colour = "RoseGold";
		m1.price = 89999;
		m1.ram = 4;

		m2.brand = "Samsung";
		m2.colour = "White";
		m2.price = 69999;
		m2.ram = 12;

		System.out.println(m1.brand);
		System.out.println(m1.colour);
		System.out.println(m1.price);
		System.out.println(m1.ram);
		System.out.println();

		System.out.println(m2.brand);
		System.out.println(m2.colour);
		System.out.println(m2.price);
		System.out.println(m2.ram);

	}

}
