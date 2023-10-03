package day3Test;

public class CarQ10Use {
	public static void main(String[] args) {
		// create object for 3 cars
		CarQ10 c1 = new CarQ10();// car1
		CarQ10 c2 = new CarQ10();// car2
		CarQ10 c3 = new CarQ10();// car3

		c1.b = "BMW";
		c1.m = "XVI";
		c1.p = 400000;
		c1.isP = false;

		c2.b = "Tata";
		c2.m = "IX";
		c2.p = 300000;
		c2.isP = true;

		c3.b = "Swift";
		c3.m = "X2V";
		c3.p = 200000;
		c3.isP = true;
		// find length of the each brand names
		System.out.println(
				"The length of the given names are: " + c1.b.length() + " " + c2.b.length() + " " + c3.b.length());

		// find total price of the cars
		System.out.println("Total Price of the cars is: " + (c1.p + c2.p + c3.p));

		// print brand names in upper case
		System.out.println("Brands Are: " + c1.b.toUpperCase() + " " + c2.b.toUpperCase() + " " + c3.b.toUpperCase());

	}

}
