package revision;

public class Refill {
	private String brand;
	private int price;

	public void setBrand(String b) {
		brand = b;
	}

	public void setPrice(int p) {
		price = p;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public Refill(String b, int p) {
		brand = b;
		price = p;
	}

	public String toString() {
		return "BRAND: " + brand + ", " + "PRICE: " + price;
	}

}
