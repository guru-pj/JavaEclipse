package revision;

public class Pen {
	private String brand;
	private int price;
	private Refill refill;

	public void setBrand(String b) {
		brand = b;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}

	public void setRefill(Refill r) {
		refill = r;
	}

	public Refill getRefill() {
		return refill;
	}

	public Pen(String b, int p, Refill r) {
		brand = b;
		price = p;
		refill = r;
	}

	public String toString() {
		return "PEN DATA " + "BRAND: " + brand + ", " + "PRICE: " + price + " REFILL DATA " + refill;
	}

}
