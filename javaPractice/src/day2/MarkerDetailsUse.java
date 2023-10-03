package day2;

public class MarkerDetailsUse {

	public static void main(String[] args) {

		MarkerDetails m1 = new MarkerDetails(); // object 1 creation for marker1
		MarkerDetails m2 = new MarkerDetails(); // object 2 creation for marker 2
		MarkerDetails m3 = new MarkerDetails();

		m1.shape = "Cylinder";
		m1.height = 10.10f;
		m1.weight = 5.10f;
		m1.colour = "Red";
		m1.price = 10;
		m1.brandName = "Camlin";
		m1.isRefillable = false;

		System.out.println(m1.shape);
		System.out.println(m1.height);
		System.out.println(m1.weight);
		System.out.println(m1.colour);
		System.out.println(m1.price);
		System.out.println(m1.brandName);
		System.out.println(m1.isRefillable);
		System.out.println();

		m2.shape = "round";
		m2.height = 20.1f;
		m2.weight = 7.10f;
		m2.colour = "Black";
		m2.price = 20;
		m2.brandName = "Natraj";
		m2.isRefillable = true;

		System.out.println(m2.shape);
		System.out.println(m2.height);
		System.out.println(m2.weight);
		System.out.println(m2.colour);
		System.out.println(m2.price);
		System.out.println(m2.brandName);
		System.out.println(m2.isRefillable);
		System.out.println();

		m3.shape = "Oval";
		m3.height = 10f;
		m3.weight = 21.1f;
		m3.colour = "blue";
		m3.price = 15;
		m3.brandName = "hausen";
		m3.isRefillable = false;

		System.out.println(m3.shape);
		System.out.println(m3.height);
		System.out.println(m3.weight);
		System.out.println(m3.colour);
		System.out.println(m3.price);
		System.out.println(m3.brandName);
		System.out.println(m3.isRefillable);
		System.out.println();

	}

}
