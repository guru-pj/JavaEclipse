package testQuestions;

public class AC extends Exception {
	String brand;
	String model;
	int price;
	int warranty;

	public int getWarranty() {
		return warranty;
	}

	public AC(String b, String m, int p, int w) {
		brand = b;
		model = m;
		price = p;
		warranty = w;
	}

	public AC(String s) {
		super(s);

	}

}
