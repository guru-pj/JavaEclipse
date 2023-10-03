package multiLevel;

public class AudioProduct {

	int price;
	String colour;

	public AudioProduct(int p, String c) {

		price = p;
		colour = c;
	}

	public String toString() {
		return "Price: " + price + ", " + "Colour: " + colour;
	}
}
