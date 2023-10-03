package inheritanceSingle;

public class Vehicle {
	int price;
	String colour;

	public int getNetPrice(int tax) {

		return (this.price * tax / 100) + this.price;
	}

	public Vehicle(int p, String co) {
		price = p;
		colour = co;
	}

	public String toString() {
		return "Price: " + price + ", " + "Colour: " + colour;
	}

}
