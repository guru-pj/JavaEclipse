package constructorAndToStringMethod;

public class Marker {
	private String brand;
	private int price;
	private boolean isRefillable;
	private String colour;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setIsRefillable(boolean isRefillable) {
		this.isRefillable = isRefillable;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public boolean getIsRefillable() {
		return isRefillable;
	}

	public String getColour() {
		return colour;
	}

	public Marker(String brand, int price, boolean isRefillable, String colour) {
		this.brand = brand;
		this.price = price;
		this.isRefillable = isRefillable;
		this.colour = colour;
	}

	public Marker() {

	}
}
