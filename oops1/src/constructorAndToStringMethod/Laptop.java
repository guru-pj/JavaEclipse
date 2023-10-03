package constructorAndToStringMethod;

public class Laptop {
	String brand;
	int price;
	int ram;
	String colour;
	boolean isTouch;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setIsTouch(boolean isTouch) {
		this.isTouch = isTouch;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public int getRam() {
		return ram;
	}

	public String getColour() {
		return colour;
	}

	public boolean getIsTouch() {
		return isTouch;
	}

	public Laptop(String brand, int price, int ram, String colour, boolean isTouch) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.colour = colour;
		this.isTouch = isTouch;
	}

	public String toString() {
		return brand + " " + price + " " + ram + " " + colour + " " + isTouch;
	}
}
