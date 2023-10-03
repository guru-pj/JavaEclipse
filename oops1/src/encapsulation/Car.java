package encapsulation;

public class Car {
	private String brand;
	private int price;
	private String colour;
	private int disAmount;
	private int netPrice;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getDisAmount() {
		return disAmount;
	}

	public void setDisAmount(int disAmount) {
		this.disAmount = disAmount;
	}

	public int getNetPrice() {

		return netPrice;
	}

	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}

}
