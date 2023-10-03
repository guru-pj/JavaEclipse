package streams;

public class Bike {
	private String noPlate;
	private String brand;
	private String model;
	private String colour;
	private int price;

	public String getNoPlate() {
		return noPlate;
	}

	public void setNoPlate(String noPlate) {
		this.noPlate = noPlate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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
