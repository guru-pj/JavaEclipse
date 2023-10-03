package arrayList;

public class Mobile {
	private String brand;
	private String colour;
	private int ram;
	private boolean isWaterProof;
	private int price;

	public void setBrand(String b) {
		brand = b;
	}

	public String getBrand() {
		return brand;
	}

	public void setColour(String c) {
		colour = c;
	}

	public String getColour() {
		return colour;
	}

	public void setRam(int r) {
		ram = r;
	}

	public int getRam() {
		return ram;
	}

	public void setIsWaterProof(boolean is) {
		isWaterProof = is;
	}

	public boolean getIsWaterProof() {
		return isWaterProof;
	}

	public void setPrice(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}

	public Mobile(String b, String c, int r, boolean is, int p) {
		brand = b;
		colour = c;
		ram = r;
		isWaterProof = is;
		price = p;
	}

	public String toString() {
		return brand + ", " + colour + ", " + ram + ", " + isWaterProof + ", " + price;
	}
}
