package streams;

public class Mobile {

	private String brand;
	private String modelCode;
	private int price;
	private int ram;
	private boolean isWaterProof;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public boolean isWaterProof() {
		return isWaterProof;
	}

	public void setWaterProof(boolean isWaterProof) {
		this.isWaterProof = isWaterProof;
	}

	public Mobile(String brand, String modelCode, int price, int ram, boolean isWaterProof) {
		super();
		this.brand = brand;
		this.modelCode = modelCode;
		this.price = price;
		this.ram = ram;
		this.isWaterProof = isWaterProof;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", modelCode=" + modelCode + ", price=" + price + ", ram=" + ram
				+ ", isWaterProof=" + isWaterProof + "]";
	}

}
