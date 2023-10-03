package inheritanceSingle;

public class UseCar {
	public static void main(String[] args) {

		Car c1 = new Car("MAruti", "DESIRE Z+", 900, 700000, "Blue");

		// c1.brand = "Maruti";
		// c1.cc = 900;
		// c1.colour = "Blue";
		// c1.model = "Desire Z+";
		// c1.price = 700000;

		// System.out.println("Mileage of " + c1.brand + " " + c1.model + " is " +
		// c1.findMileage());
		// System.out.println(c1.getNetPrice(10));
		System.out.println(c1.toString());
	}
}
