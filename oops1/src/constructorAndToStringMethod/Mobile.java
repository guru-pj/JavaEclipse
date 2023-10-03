package constructorAndToStringMethod;

public class Mobile {
	private String brand;
	private String colour;
	private int price;
	Display display;
	Processor processor;

	public String getBrand() {
		return brand;
	}

	public String getColour() {
		return colour;
	}

	public int getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
