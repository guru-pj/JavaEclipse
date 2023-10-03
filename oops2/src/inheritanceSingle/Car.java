package inheritanceSingle;

public class Car extends Vehicle {
	String brand;
	String model;
	int cc;

	public int findMileage() {
		if (cc > 300 && cc <= 600) {
			return 30;
		} else if (cc > 600 && cc <= 1000) {
			return 20;
		} else {
			return 10;
		}
	}

	public Car(String b, String m, int c, int pri, String colour) {
		super(pri, colour);
		brand = b;
		model = m;
		cc = c;
	}

	public String toString() {
		return "Brand: " + brand + ", " + "Model: " + model + ", " + "CC: " + cc + ", " + super.toString();
	}
}
