package hashMap;

public class Bike {
	private String noPlate;
	private String brand;
	private String model;
	private String colour;
	private int price;

	public void setNoPlate(String n) {
		noPlate = n;
	}

	public void setBrand(String b) {
		brand = b;
	}

	public void setModel(String m) {
		model = m;
	}

	public void setcolour(String c) {
		colour = c;
	}

	public void setNoPlate(int p) {
		price = p;
	}

	public String getNoPlate() {
		return noPlate;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColour() {
		return colour;
	}

	public int getPrice() {
		return price;
	}

	public Bike(String n, String b, String m, String c, int p) {
		noPlate = n;
		brand = b;
		model = m;
		colour = c;
		price = p;
	}

	public String toString() {
		return brand + " " + model + " " + colour + " " + noPlate + " " + price;
	}
}
